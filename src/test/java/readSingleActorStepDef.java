
import Fake.Films.top.trumps.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;


@ScenarioScope
public class readSingleActorStepDef {
    @Autowired
    private ActorRepository actorRepo;
    @Autowired
    private FilmRepository filmRepo;
    @Autowired
    private CategoryRepository categoryRepo;
    @Autowired
    FakeFilmsTopTrumpsApplication please = new FakeFilmsTopTrumpsApplication(actorRepo, filmRepo, categoryRepo);


    int id;
    String actorOutput;
    Actor requestedActor;

    @Given("That an actor exists at position {int}")
    public void that_an_actor_exists_at_position(Integer int1) {
        id = int1;

    }

    @When("a user requests the details of a single actor")
    public void a_user_requests_the_details_of_a_single_actor() {
        requestedActor = actorRepo.getActorById(id);
        //requestedActor = please.actorRepo.findById(id).orElseThrow(() -> new ResourceAccessException("Actor not found at " + id));

    }

    @Then("the actors details {string} {string} are displayed")
    public void the_actors_details_are_displayed(String string, String string2) {
        StringBuilder output = new StringBuilder();
        output.append("Actor id = ");
        output.append(id);
        output.append(" first name = ");
        output.append(string);
        output.append(" last name = ");
        output.append(string2);

        actorOutput = requestedActor.toString();
        Assertions.assertEquals(output.toString(), actorOutput, "");

    }
}
