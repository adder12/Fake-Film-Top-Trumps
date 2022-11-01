import Fake.Films.top.trumps.Film;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class filmComparisonStepDef {
    Film myFilm = new Film("title", "test", 2006, 15, 110, 15, "G");
    Film compFilm = new Film("title", "test", 2006, 14, 110, 15, "G");

    @Given("when my rentalRate stat is higher than the other film")
    public void when_my_movies_stat_is_higher_than_the_other_film() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the values are compared")
    public void the_values_are_compared() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should get a point")
    public void i_should_get_a_point() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}