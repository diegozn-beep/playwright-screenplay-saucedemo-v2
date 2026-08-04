package edu.pe.cibertec.saucedemo.stepdefinitions;

import edu.pe.cibertec.saucedemo.questions.TheCart;
import edu.pe.cibertec.saucedemo.tasks.AgregarAlCarrito;
import edu.pe.cibertec.saucedemo.tasks.EliminarDelCarrito;
import edu.pe.cibertec.saucedemo.tasks.GoToCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class CartStepDefinitions {

    @And("she adds the product {string} to the cart")
    public void sheAddsTheProductToTheCart(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarAlCarrito.product(productName)
        );
    }

    @Then("the cart icon should display {string}")
    public void theCartIconShouldDisplay(String count) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(TheCart.badgeCount(), equalTo(count))
        );
    }

    @And("the cart should contain {string} and {string}")
    public void theCartShouldContainAnd(String product1, String product2) {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToCart.page());
        OnStage.theActorInTheSpotlight().should(
                seeThat(TheCart.contains(product1), is(true)),
                seeThat(TheCart.contains(product2), is(true))
        );
    }

    @And("she removes the product {string} from the cart")
    public void sheRemovesTheProductFromTheCart(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EliminarDelCarrito.product(productName)
        );
    }

    @And("the cart should only contain {string}")
    public void theCartShouldOnlyContain(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToCart.page());
        OnStage.theActorInTheSpotlight().should(
                seeThat(TheCart.contains(productName), is(true))
        );
    }
}