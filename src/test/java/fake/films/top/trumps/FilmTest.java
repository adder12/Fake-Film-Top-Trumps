package fake.films.top.trumps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FilmTest {

    Film testFilm = new Film();
    Film newFilm = new Film("test", "test", 2000, 20.4, 90, 10.53, "PG");


    @Test
    void testGetFilmId() {
        Assertions.assertEquals(0, testFilm.getFilmId(), "The id was incorrect");
    }

    @Test
    void testTitle() {
        testFilm.setTitle("test");
        Assertions.assertEquals("test", testFilm.getTitle(), "The title is incorrect");
    }

    @Test
    void testDescription() {
        testFilm.setDescription("test");
        Assertions.assertEquals("test", testFilm.getDescription(), "The description was incorrect");
    }

    @Test
    void testReleaseYear() {
        testFilm.setReleaseYear(2000);
        Assertions.assertEquals(2000, testFilm.getReleaseYear(), "The release year was incorrect");
    }

    @Test
    void testRentalRate() {
        testFilm.setRentalRate(10.54);
        Assertions.assertEquals(10.54, testFilm.getRentalRate(), "The rental rate was incorrect");
    }

    @Test
    void testLength() {
        testFilm.setLength(200);
        Assertions.assertEquals(200, testFilm.getLength(), "The length was incorrect");
    }

    @Test
    void testReplacementCost() {
        testFilm.setReplacementCost(21.43);
        Assertions.assertEquals(21.43, testFilm.getReplacementCost(), "The replacement cost was incorrect");
    }

    @Test
    void testRating() {
        testFilm.setRating("G");
        Assertions.assertEquals("G", testFilm.getRating(), "The rating was incorrect");
    }

    @Test
    void testGetIntRatingG() {
        testFilm.setRating("G");
        Assertions.assertEquals(1, testFilm.getIntRating(), "The get Int rating method failed on G");
    }

    @Test
    void testGetIntRatingPG() {
        testFilm.setRating("PG");
        Assertions.assertEquals(2, testFilm.getIntRating(), "The get Int rating method failed on PG");
    }

    @Test
    void testGetIntRatingPG13() {
        testFilm.setRating("PG-13");
        Assertions.assertEquals(3, testFilm.getIntRating(), "The get int rating method failed on PG-13");
    }

    @Test
    void testGetIntRatingNC17() {
        testFilm.setRating("NC-17");
        Assertions.assertEquals(4, testFilm.getIntRating(), "The get int rating method failed on NC-17");
    }

    @Test
    void testGetIntRatingR() {
        testFilm.setRating("R");
        Assertions.assertEquals(5, testFilm.getIntRating(), "The get int rating method failed on R");
    }

    @Test
    void testGetIntRatingDEF() {
        testFilm.setRating("test");
        Assertions.assertEquals(0, testFilm.getIntRating(), "The get int rating method failed on the default case");
    }

    @Test
    void testCompareLengthLess() {
        testFilm.setLength(89);
        Assertions.assertEquals(0, testFilm.compareLength(newFilm), "The length comparison failed on shorter");
    }

    @Test
    void testCompareLengthSame() {
        testFilm.setLength(90);
        Assertions.assertEquals(1, testFilm.compareLength(newFilm), "The length comparison failed on equal");
    }

    @Test
    void testCompareLengthMore() {
        testFilm.setLength(91);
        Assertions.assertEquals(2, testFilm.compareLength(newFilm), "The length comparison failed on longer");
    }


    @Test
    void testCompareRentalRateLess() {
        testFilm.setRentalRate(20.39);
        Assertions.assertEquals(0, testFilm.compareRentalRate(newFilm), "The rental rate comparison failed on lesser");
    }

    @Test
    void testCompareRentalRateSame() {
        testFilm.setRentalRate(20.4);
        Assertions.assertEquals(1, testFilm.compareRentalRate(newFilm), "The rental rate comparison failed on same");
    }

    @Test
    void testCompareRentalRateMore() {
        testFilm.setRentalRate(20.41);
        Assertions.assertEquals(2, testFilm.compareRentalRate(newFilm), "The rental rate comparison failed om more");
    }


    @Test
    void testCompareReplacementCostLess() {
        testFilm.setReplacementCost(10.52);
        Assertions.assertEquals(0, testFilm.compareReplacementCost(newFilm), "The replacement rate comparison failed on lower");
    }

    @Test
    void testCompareReplacementCostSame() {
        testFilm.setReplacementCost(10.53);
        Assertions.assertEquals(1, testFilm.compareReplacementCost(newFilm), "The replacement cost comparison failed on same");
    }

    @Test
    void testCompareReplacementCostMore() {
        testFilm.setReplacementCost(10.54);
        Assertions.assertEquals(2, testFilm.compareReplacementCost(newFilm), "The replacment cost comparison failed on larger");
    }

    @Test
    void testCompareRatingLess() {
        testFilm.setRating("G");
        Assertions.assertEquals(0, testFilm.compareRating(newFilm), "The rating comparison failed on lower");
    }

    @Test
    void testCompareRatingSame() {
        testFilm.setRating("PG");
        Assertions.assertEquals(1, testFilm.compareRating(newFilm), "The rating comparison failed on equal");
    }

    @Test
    void testCompareRatingMore() {
        testFilm.setRating("PG-13");
        Assertions.assertEquals(2, testFilm.compareRating(newFilm), "The rating comparison failed on more");
    }


    @Test
    void testAddActor() {

        Actor testActor = new Actor();
        newFilm.addActor(testActor);
    }

    @Test
    void testAddCategory() {
        Category testCategory = new Category();
        newFilm.addCategory(testCategory);
    }


    @Test
    void testToString() {
        String testString = "Film id = 0 Title = test Description = test Release Year = 2000 RentalRate = 20.4 Length = 90 Replacement Cost = 10.53 rating = PG";
        Assertions.assertEquals(testString, newFilm.toString(), "The film to string method failed");
    }

}
//Film newFilm = new Film("test", "test", 2000, 20.4, 90, 10.53, "PG");