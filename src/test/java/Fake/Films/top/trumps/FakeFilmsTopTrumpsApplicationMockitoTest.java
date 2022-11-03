package Fake.Films.top.trumps;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.mockito.Mockito.mock;

//@ActiveProfiles("test")
//@SpringBootTest(classes = FakeFilmsTopTrumpsApplication.class)
//@RunWith(MockitoJUnitRunner.class)
public class FakeFilmsTopTrumpsApplicationMockitoTest {


    ActorRepository actorRepo = mock(ActorRepository.class);

    FilmRepository filmRepo = mock(FilmRepository.class);

    CategoryRepository categoryRepo = mock(CategoryRepository.class);


    FakeFilmsTopTrumpsApplication testMain = new FakeFilmsTopTrumpsApplication(actorRepo, filmRepo, categoryRepo);

    @Test
    public void getSingleActor() {
        Actor test = new Actor("test", "test");
        Mockito.when(actorRepo.findById(1)).thenReturn(Optional.of(test));
        Actor returnedActor = testMain.getSingleActor(1);
        Assertions.assertEquals(test, returnedActor, "The mockito test for Get single actor failed");
    }
}
