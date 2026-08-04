package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.CartPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.interactions.Click;

public class GoToInventory {

    public static Performable page() {
        return Task.where("{0} continues shopping back to the inventory page",
                Click.on(Target.the("Continue shopping button")
                        .locatedBy(CartPage.CONTINUE_SHOPPING_BUTTON)));
    }
}