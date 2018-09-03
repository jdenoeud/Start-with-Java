package com.ocr.justine;

import org.junit.jupiter.api.Test;

public class ExpressDeliveryTest {

    @Test
    public void Given_InParis_WhenGettingDeliveryPrice_ThenGet6e99() {
        Delivery delivery = new ExpressDelivery("Paris");
        assertEquals(6.99, delivery.getPrice(), 0.01);
    }

    @Test
    public void Given_OutOfParis_WhenGettingDeliveryPrice_ThenGet9e99() {
        Delivery delivery = new ExpressDelivery("Bordeaux");
        assertEquals(9.99, delivery.getPrice(), 0.01);
    }


}
