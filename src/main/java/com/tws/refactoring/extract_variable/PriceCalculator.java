package com.tws.refactoring.extract_variable;

public class PriceCalculator {

    public static final int MIN_DISCOUNT = 0;
    public static final int BASE = 500;
    public static final double DISCOUNT_RATE = 0.05;
    public static final double SHIPPING_CAST_RATE = 0.1;
    public static final double SHIPING_COST_MAX = 100.0;

    public double getPrice(int quantity, int itemPrice) {
        double discount = Math.max(MIN_DISCOUNT, quantity - BASE) * itemPrice * DISCOUNT_RATE;
        double shippingCost = Math.min(quantity * itemPrice * SHIPPING_CAST_RATE, SHIPING_COST_MAX);
        double basePrice = quantity * itemPrice;
        return basePrice - discount + shippingCost;
    }
}
