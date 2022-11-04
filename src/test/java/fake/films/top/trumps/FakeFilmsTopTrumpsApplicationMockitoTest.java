package fake.films.top.trumps;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.mockito.Mockito;


import java.util.ArrayList;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.*;


class FakeFilmsTopTrumpsApplicationMockitoTest {
    ActorRepository actorRepo = mock(ActorRepository.class);
    FilmRepository filmRepo = mock(FilmRepository.class);
    CategoryRepository categoryRepo = mock(CategoryRepository.class);
    FakeFilmsTopTrumpsApplication testMain = new FakeFilmsTopTrumpsApplication(actorRepo, filmRepo, categoryRepo);
    int id = 1;
    Film film = new Film();

    @Test
    void getSingleActorTest() {
        Actor test = new Actor();
        Mockito.when(actorRepo.findById(id)).thenReturn(Optional.of(test));
        Actor returnedActor = testMain.getSingleActor(id);
        Assertions.assertEquals(test, returnedActor, "The mockito test for Get single actor failed");
    }

    @Test
    void getSingleFilmTest() {

        Mockito.when(filmRepo.findById(id)).thenReturn(Optional.of(film));
        Film returnedFilm = testMain.getSingleFilm(id);
        Assertions.assertEquals(film, returnedFilm, "The Mockito test for get Single Film failed");
    }

    @Test
    void getAllFilmsTest() {
        ArrayList<Film> filmList = new ArrayList<Film>();

        Mockito.when(filmRepo.findAll()).thenReturn(filmList);
        ArrayList<Film> returnedFilm = (ArrayList<Film>) testMain.getAllFilms();

        Assertions.assertEquals(filmList, returnedFilm, "The Mockito test for getting all films failed");
    }

    @Test
    void createFilmTest() {

        Mockito.when(filmRepo.save(film)).thenReturn(film);
        testMain.createFilm(film);
        verify(filmRepo).save(film);
    }

//    @Test
//    void updateFilmTest() {
//        Mockito.when(filmRepo.save(film)).thenReturn(film);
//        testMain.updateFilm(id, film);
//        verify(filmRepo).save(film);
//    }

    @Test
    void deleteFilmTest() {
        Mockito.doNothing().when(filmRepo).deleteById(isA(Integer.class));
        testMain.deleteFilm(id);
        verify(filmRepo).deleteById(id);

    }
}
