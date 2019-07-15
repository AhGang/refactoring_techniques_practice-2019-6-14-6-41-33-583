package com.tws.refactoring.extract_method;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {
    @Test
    public void printOwing() {
        OwingPrinter owingPrinter = new OwingPrinter();

        owingPrinter.printOwing("Hello", Arrays.asList(new Order(1),
                new Order(2),
                new Order(3)));
        assertEquals("*****************************\n****** Customer totals ******\n*****************************\nname: Hello\namount: 6.0\n"
                , outContent.toString());
    }
}
