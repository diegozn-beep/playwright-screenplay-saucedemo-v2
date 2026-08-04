package edu.pe.cibertec.saucedemo.ui;

public class CartPage {

    public static final String CART_ICON_LINK = "[data-test='shopping-cart-link']";
    public static final String CART_BADGE = "[data-test='shopping-cart-badge']";
    public static final String CONTINUE_SHOPPING_BUTTON = "[data-test='continue-shopping']";


    public static String productActionButton(String productName) {
        return "xpath=//*[text()='" + productName + "']/ancestor::*[.//button][1]//button";
    }

    public static String cartItemName(String productName) {
        return "xpath=//*[@data-test='inventory-item-name'][text()='" + productName + "']";
    }

    private CartPage() {}
}