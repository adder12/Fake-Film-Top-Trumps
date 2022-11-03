package Fake.Films.top.trumps;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.mockito.Mockito.mock;

@ActiveProfiles("test")
@SpringBootTest(classes = FakeFilmsTopTrumpsApplication.class)
@RunWith(MockitoJUnitRunner.class)
class FakeFilmsTopTrumpsApplicationMockitoTest {


    @Autowired
    ActorRepository actorRepo = mock(ActorRepository.class);
    @Autowired
    FilmRepository filmRepo = mock(FilmRepository.class);
    @Autowired
    CategoryRepository categoryRepo = mock(CategoryRepository.class);


    FakeFilmsTopTrumpsApplication testMain = mock(FakeFilmsTopTrumpsApplication.class);

    @Test
    public void getSingleActor() {
        Actor test = new Actor("test", "test");
        Mockito.when(testMain.getSingleActor(1)).thenReturn(test);
        Actor returnedActor = testMain.getSingleActor(1);
        Assertions.assertEquals(test, test, "The mockito test for Get single actor failed");
    }
}
