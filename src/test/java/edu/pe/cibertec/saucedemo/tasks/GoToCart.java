package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.CartPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.interactions.Click;

public class GoToCart {

    public static Performable page() {
        return Task.where("{0} opens the shopping cart",
                Click.on(Target.the("Cart icon")
                        .locatedBy(CartPage.CART_ICON_LINK)));
    }
}