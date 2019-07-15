package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void should_print_owing_when_add_name_and_orders() {
        //Given
        OwingPrinter owingPrinter = new OwingPrinter();
        //WHEN
        owingPrinter.printOwing("NAME", Arrays.asList(new Order(1),
                new Order(2),
                new Order(3)));
        //THEN
        assertEquals("*****************************\n****** Customer totals ******\n*****************************\nname: NAME\namount: 6.0\n"
                , outContent.toString());
    }
}