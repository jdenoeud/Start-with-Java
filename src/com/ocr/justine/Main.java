package com.ocr.justine;


public class Main {

    public static void main(String[] args) {
	// write your code here
      System.out.println("coucou");

      Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");

     DirectDelivery directDelivery = new DirectDelivery();
     System.out.println(directDelivery.getPrice());

     ExpressDelivery livraisonExpress = new ExpressDelivery("Aix");
        System.out.println(livraisonExpress.getPrice());
    }
}
