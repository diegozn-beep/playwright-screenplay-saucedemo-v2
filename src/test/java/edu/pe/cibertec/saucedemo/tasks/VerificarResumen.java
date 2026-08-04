package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.questions.TheCheckout;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class VerificarResumen implements Performable {

    private final String expectedItemTotal;

    private VerificarResumen(String expectedItemTotal) {
        this.expectedItemTotal = expectedItemTotal;
    }

    public static Performable withItemTotal(String expectedItemTotal) {
        return new VerificarResumen(expectedItemTotal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(TheCheckout.itemTotal(), equalTo(expectedItemTotal)));
    }
}