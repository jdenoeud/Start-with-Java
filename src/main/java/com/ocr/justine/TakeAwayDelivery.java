package com.ocr.justine;

public class TakeAwayDelivery implements Delivery{
    @Override
    public double getPrice(){
        return 0;
    }

    @Override
    public String getInfo(){
        return "Livraison à l'entrepot";
    }
}
