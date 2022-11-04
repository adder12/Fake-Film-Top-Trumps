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
    Actor actor = new Actor();
    Category category = new Category();

    @Test
    void getSingleActorTest() {

        Mockito.when(actorRepo.findById(id)).thenReturn(Optional.of(actor));
        Actor returnedActor = testMain.getSingleActor(id);
        Assertions.assertEquals(actor, returnedActor, "The mockito test for Get single actor failed");
    }

    @Test
    void getAllActorsTest() {
        ArrayList<Actor> actorList = new ArrayList<>();
        Mockito.when(actorRepo.findAll()).thenReturn(actorList);
        ArrayList<Actor> returnedActor = (ArrayList<Actor>) testMain.getAllActors();
        Assertions.assertEquals(actorList, returnedActor, "The get all actors test failed");
    }

    @Test
    void createActorTest() {
        Mockito.when(actorRepo.save(actor)).thenReturn(actor);
        testMain.createActor(actor);
        verify(actorRepo).save(actor);
    }

    @Test
    void deleteActorTest() {
        Mockito.doNothing().when(actorRepo).deleteById(isA(Integer.class));
        testMain.deleteActor(id);
        verify(actorRepo).deleteById(id);
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

        testMain.createFilm(film);
        verify(filmRepo).save(film);
    }

    // @Test
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

    @Test
    void getSingleCategoryTest() {
        Mockito.when(categoryRepo.findById(id)).thenReturn(Optional.of(category));
        Category returnedCategory = testMain.getSingleCategory(id);
        Assertions.assertEquals(category, returnedCategory, "The get single category method failed");
    }

    @Test
    void getAllCategoriesTest() {
        ArrayList<Category> categoryList = new ArrayList<>();
        Mockito.when(categoryRepo.findAll()).thenReturn(categoryList);
        ArrayList<Category> returnedList = (ArrayList<Category>) testMain.getAllCategories();
        Assertions.assertEquals(categoryList, returnedList, "The get all category method failed");
    }

    @Test
    void createCategory() {
        testMain.createCategory(category);
        verify(categoryRepo).save(category);
    }

    @Test
    void deleteCategory() {
        Mockito.doNothing().when(categoryRepo).deleteById(isA(Integer.class));
        testMain.deleteCategory(id);
        verify(categoryRepo).deleteById(id);
    }
}
