package Fake.Films.top.trumps;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {
    Actor testActor = new Actor();


    @Test
    public void testgetFirstName() {
        testActor.setFirstName("test");
        Assertions.assertEquals("test", testActor.getFirstName(), "The first name was incorrect");
    }

    @Test
    public void testgetLastName() {
        testActor.setLastName("test");
        Assertions.assertEquals("test", testActor.getLastName(), "The last name was incorrect");
    }
    
}
