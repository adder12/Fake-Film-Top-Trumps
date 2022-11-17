package fake.films.top.trumps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorModelTest {

    ActorModel testActor = new ActorModel();
    ActorModel testActorTwo = new ActorModel("test", "test");


    @Test
    void testToString() {
        String testString = "Actor id = 0 first name = null last name = null";
        Assertions.assertEquals(testString, testActor.toString(), "The to string method failed");
    }

    @Test
    void testGetActorId() {

        Assertions.assertEquals(0, testActorTwo.getActorId(), "The actor ID is incorrect");

    }

    @Test
    void testgetFirstName() {
        testActor.setFirstName("test");
        Assertions.assertEquals("test", testActor.getFirstName(), "The first name was incorrect");
    }

    @Test
    void testgetLastName() {
        testActor.setLastName("test");
        Assertions.assertEquals("test", testActor.getLastName(), "The last name was incorrect");
    }

}
