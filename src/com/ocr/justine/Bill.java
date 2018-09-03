package com.ocr.justine;

import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product,Integer> products;
    private Delivery delivery;

    /**
     * Add a product with a quantity in the bill
     * @param product product to add
     * @param quantity quantity of the product
     */
    public void addProduct(Product product, Integer quantity){

        this.products.put(product, quantity);
    }


    public Customer getCustomer() {
        return customer;
    }

    public Map<Product,Integer> getProducts() {

        return products;
    }


    /**
     * Constructor for bill
     * @param customer
     */
    public Bill(Customer customer, Delivery delivery){

        this.customer = customer;
        this.delivery = delivery;
    }


}
