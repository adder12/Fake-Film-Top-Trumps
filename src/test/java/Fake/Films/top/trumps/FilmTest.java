package Fake.Films.top.trumps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {

    Film testFilm = new Film();
    Film newFilm = new Film("test", "test", 2000, 20.4, 90, 10.53, "PG");


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
    public void testGetIntRatingG() {
        testFilm.setRating("G");
        Assertions.assertEquals(1, testFilm.getIntRating(), "The get Int rating method failed on G");
    }

    @Test
    public void testGetIntRatingPG() {
        testFilm.setRating("PG");
        Assertions.assertEquals(2, testFilm.getIntRating(), "The get Int rating method failed on PG");
    }

    @Test
    public void testGetIntRatingPG13() {
        testFilm.setRating("PG-13");
        Assertions.assertEquals(3, testFilm.getIntRating(), "The get int rating method failed on PG-13");
    }

    @Test
    public void testGetIntRatingNC17() {
        testFilm.setRating("NC-17");
        Assertions.assertEquals(4, testFilm.getIntRating(), "The get int rating method failed on NC-17");
    }

    @Test
    public void testGetIntRatingR() {
        testFilm.setRating("R");
        Assertions.assertEquals(5, testFilm.getIntRating(), "The get int rating method failed on R");
    }

    @Test
    public void testGetIntRatingDEF() {
        testFilm.setRating("test");
        Assertions.assertEquals(0, testFilm.getIntRating(), "The get int rating method failed on the default case");
    }

    @Test
    public void testCompareLengthLess() {
        testFilm.setLength(89);
        Assertions.assertEquals(0, testFilm.compareLength(newFilm), "The length comparison failed on shorter");
    }

    @Test
    public void testCompareLengthSame() {
        testFilm.setLength(90);
        Assertions.assertEquals(1, testFilm.compareLength(newFilm), "The length comparison failed on equal");
    }

    @Test
    public void testCompareLengthMore() {
        testFilm.setLength(91);
        Assertions.assertEquals(2, testFilm.compareLength(newFilm), "The length comparison failed on longer");
    }


    @Test
    public void testCompareRentalRateLess() {
        testFilm.setRentalRate(20.39);
        Assertions.assertEquals(0, testFilm.compareRentalRate(newFilm), "The rental rate comparison failed on lesser");
    }

    @Test
    public void testCompareRentalRateSame() {
        testFilm.setRentalRate(20.4);
        Assertions.assertEquals(1, testFilm.compareRentalRate(newFilm), "The rental rate comparison failed on same");
    }

    @Test
    public void testCompareRentalRateMore() {
        testFilm.setRentalRate(20.41);
        Assertions.assertEquals(2, testFilm.compareRentalRate(newFilm), "The rental rate comparison failed om more");
    }


    @Test
    public void testCompareReplacementCostLess() {
        testFilm.setReplacementCost(10.52);
        Assertions.assertEquals(0, testFilm.compareReplacementCost(newFilm), "The replacement rate comparison failed on lower");
    }

    @Test
    public void testCompareReplacementCostSame() {
        testFilm.setReplacementCost(10.53);
        Assertions.assertEquals(1, testFilm.compareReplacementCost(newFilm), "The replacement cost comparison failed on same");
    }

    @Test
    public void testCompareReplacementCostMore() {
        testFilm.setReplacementCost(10.54);
        Assertions.assertEquals(2, testFilm.compareReplacementCost(newFilm), "The replacment cost comparison failed on larger");
    }

    @Test
    public void testCompareRatingLess() {
        testFilm.setRating("G");
        Assertions.assertEquals(0, testFilm.compareRating(newFilm), "The rating comparison failed on lower");
    }

    @Test
    public void testCompareRatingSame() {
        testFilm.setRating("PG");
        Assertions.assertEquals(1, testFilm.compareRating(newFilm), "The rating comparison failed on equal");
    }

    @Test
    public void testCompareRatingMore() {
        testFilm.setRating("PG-13");
        Assertions.assertEquals(2, testFilm.compareRating(newFilm), "The rating comparison failed on more");
    }


}
