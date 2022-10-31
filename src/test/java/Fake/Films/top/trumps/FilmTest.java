package Fake.Films.top.trumps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {

    Film testFilm = new Film();
    Film newFilm = new Film("test", "test", 2000, 20.4, 90, 10.53, "PG-13");


    @Test
    public void testGetFilmId() {
        Assertions.assertEquals(0, testFilm.getFilmId(), "The id was incorrect");
    }

    @Test
    public void testTitle() {
        testFilm.setTitle("test");
        Assertions.assertEquals("test", testFilm.getTitle(), "The title is incorrect");
    }

    @Test
    public void testDescription() {
        testFilm.setDescription("test");
        Assertions.assertEquals("test", testFilm.getDescription(), "The description was incorrect");
    }

    @Test
    public void testReleaseYear() {
        testFilm.setReleaseYear(2000);
        Assertions.assertEquals(2000, testFilm.getReleaseYear(), "The release year was incorrect");
    }

    @Test
    public void testRentalRate() {
        testFilm.setRentalRate(10.54);
        Assertions.assertEquals(10.54, testFilm.getRentalRate(), "The rental rate was incorrect");
    }

    @Test
    public void testLength() {
        testFilm.setLength(200);
        Assertions.assertEquals(200, testFilm.getLength(), "The length was incorrect");
    }

    @Test
    public void testReplacementCost() {
        testFilm.setReplacementCost(21.43);
        Assertions.assertEquals(21.43, testFilm.getReplacementCost(), "The replacement cost was incorrect");
    }

    @Test
    public void testRating() {
        testFilm.setRating("G");
        Assertions.assertEquals("G", testFilm.getRating(), "The rating was incorrect");
    }

    @Test
    public void testCompareLength() {
        testFilm.setLength(80);
        Assertions.assertEquals(0, testFilm.compareLength(newFilm), "The length comparison was wrong");

    }

    @Test
    public void testCompareRentalRate() {
        testFilm.setRentalRate(14);
        Assertions.assertEquals(0, testFilm.compareRentalRate(newFilm), "The rental rate comparison was wrong");
    }

    @Test
    public void testCompareReplacementCost() {
        testFilm.setReplacementCost(9);
        Assertions.assertEquals(0, testFilm.compareReplacementCost(newFilm), "The replacement rate comparison failed");
    }

    @Test
    public void testCompareRating() {
        testFilm.setRating("G");
        Assertions.assertEquals(0, testFilm.compareRating(newFilm), "The rating comparison failed");
    }


    @Test
    public void testGetIntRating() {
        testFilm.setRating("G");
        Assertions.assertEquals(1, testFilm.getIntRating(), "The get Int rating method failed");
    }
}
