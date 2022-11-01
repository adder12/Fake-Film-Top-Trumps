
import Fake.Films.top.trumps.Actor;
import Fake.Films.top.trumps.ActorRepository;
import Fake.Films.top.trumps.FakeFilmsTopTrumpsApplication;
import Fake.Films.top.trumps.FilmRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.ResourceAccessException;

@ScenarioScope
public class readSingleActorStepDef {
    @Autowired
    private ActorRepository actorRepo;
    @Autowired
    private FilmRepository filmRepo;
    @Autowired
    FakeFilmsTopTrumpsApplication please = new FakeFilmsTopTrumpsApplication(actorRepo, filmRepo);


    int id;
    String actorOutput;
    Actor requestedActor;

    @Given("That an actor exists at the inputted position")
    public void that_an_actor_exists_at_the_inputted_position() {
        id = 190;

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("a user requests the details of a single actor")
    public void a_user_requests_the_details_of_a_single_actor() {

        requestedActor = please.actorRepo.findById(id).orElseThrow(() -> new ResourceAccessException("Actor not found at " + id));
        // throw new io.cucumber.java.PendingException();
    }

    @Then("the actors details are displayed")
    public void the_actors_details_are_displayed() {
        actorOutput = requestedActor.toString();
        Assertions.assertEquals("", "", "");
        // throw new io.cucumber.java.PendingException();
    }
}
