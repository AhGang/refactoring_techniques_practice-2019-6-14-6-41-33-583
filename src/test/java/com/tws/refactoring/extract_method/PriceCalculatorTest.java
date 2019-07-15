package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.PriceCalculator;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {
    @Test
    public void get_Price_when_give_quantity_and_itmePrice() {
        //Given
        PriceCalculator priceCalculator = new PriceCalculator();

        //When
        double result = priceCalculator.getPrice(5,5);

        //Then
        assertEquals(27.5,result,0);

    }
}
