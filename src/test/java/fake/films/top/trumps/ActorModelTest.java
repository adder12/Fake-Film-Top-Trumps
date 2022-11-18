package fake.films.top.trumps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ActorModelTest {

    ActorModel testActor = new ActorModel();
    ActorModel testActorTwo = new ActorModel("test", "test");


    @Test
    void testToString() {
        String testString = "Actor id = 0 first name = null last name = null";
        Assertions.assertEquals(testString, testActor.ModeltoString(), "The to string method failed");
    }

    @Test
    void testGetActorId() {

        Assertions.assertEquals(0, testActorTwo.getActorModelId(), "The actor ID is incorrect");

    }

    @Test
    void testgetFirstName() {
        testActor.setModelFirstName("test");
        Assertions.assertEquals("test", testActor.getModelFirstName(), "The first name was incorrect");
    }

    @Test
    void testgetLastName() {
        testActor.setModelLastName("test");
        Assertions.assertEquals("test", testActor.getModelLastName(), "The last name was incorrect");
    }

}
