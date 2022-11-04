package Fake.Films.top.trumps;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.mockito.Mockito;


import java.util.Optional;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.*;


public class FakeFilmsTopTrumpsApplicationMockitoTest {
    ActorRepository actorRepo = mock(ActorRepository.class);
    FilmRepository filmRepo = mock(FilmRepository.class);
    CategoryRepository categoryRepo = mock(CategoryRepository.class);
    FakeFilmsTopTrumpsApplication testMain = new FakeFilmsTopTrumpsApplication(actorRepo, filmRepo, categoryRepo);
    int id = 1;

    @Test
    public void getSingleActor() {
        Actor test = new Actor();
        Mockito.when(actorRepo.findById(id)).thenReturn(Optional.of(test));
        Actor returnedActor = testMain.getSingleActor(id);
        Assertions.assertEquals(test, returnedActor, "The mockito test for Get single actor failed");
    }

    @Test
    public void getSingleFilm() {
        Film film = new Film();
        Mockito.when(filmRepo.findById(id)).thenReturn(Optional.of(film));
        Film returnedFilm = testMain.getSingleFilm(id);
        Assertions.assertEquals(film, returnedFilm, "The Mockito test for get Single Film failed");
    }

    @Test
    public void createFilm() {
        Film testFilm = new Film();
        Mockito.when(filmRepo.save(testFilm)).thenReturn(testFilm);
        testMain.createFilm(testFilm);
        verify(filmRepo).save(testFilm);
    }
}
