
import fake.films.top.trumps.Film;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;

@ScenarioScope
public class lengthComparisonStepDef {
    Film filmOne = new Film();
    Film filmTwo = new Film();
    int output;

    @Given("That the user has two films to compare each having their own length {int} and {int}")
    public void that_the_user_has_two_films_to_compare_each_having_their_own_length_and(Integer int1, Integer int2) {

        filmOne.setLength(int1);
        filmTwo.setLength(int2);
    }

    @When("The films lengths are compared")
    public void the_films_lengths_are_compared() {
        output = filmOne.compareLength(filmTwo);
    }

    @Then("the program should calculate which is longer by returning the {int}")
    public void the_program_should_calculate_which_is_longer_by_returning_the(Integer int3) {
        Assertions.assertEquals(int3, output, "The length comparison returned the wrong result");
    }


}
