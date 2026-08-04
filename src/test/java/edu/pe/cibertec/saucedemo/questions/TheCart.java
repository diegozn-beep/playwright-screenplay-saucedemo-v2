package edu.pe.cibertec.saucedemo.questions;

import edu.pe.cibertec.saucedemo.ui.CartPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.questions.Text;
import net.serenitybdd.screenplay.playwright.questions.Visibility;

public class TheCart {

    public static Question<String> badgeCount() {
        return Text.of(Target.the("Cart badge")
                .locatedBy(CartPage.CART_BADGE));
    }

    public static Question<Boolean> contains(String productName) {
        return Visibility.of(Target.the("Cart item " + productName)
                .locatedBy(CartPage.cartItemName(productName)));
    }
}