package Fake.Films.top.trumps;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ActorTest {
    Actor testActor = new Actor();
    Actor testActorTwo = new Actor("test", "test");

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
