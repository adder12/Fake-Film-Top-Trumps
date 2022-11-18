package fake.films.top.trumps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class FilmModelTest {

    FilmModel testFilm = new FilmModel();
    FilmModel newFilm = new FilmModel("test", "test", 2006, 20.4, 90, 10.53, "PG");


    @Test
    void testGetFilmId() {
        Assertions.assertEquals(0, testFilm.getModelFilmId(), "The id was incorrect");
    }

    @Test
    void testTitle() {
        testFilm.setModelTitle("test");
        Assertions.assertEquals("test", testFilm.getModelTitle(), "The title is incorrect");
    }

    @Test
    void testDescription() {
        testFilm.setModelDescription("test");
        Assertions.assertEquals("test", testFilm.getModelDescription(), "The description was incorrect");
    }

    @Test
    void testReleaseYear() {
        testFilm.setModelReleaseYear(2000);
        Assertions.assertEquals(2000, testFilm.getModelReleaseYear(), "The release year was incorrect");
    }

    @Test
    void testRentalRate() {
        testFilm.setModelRentalRate(10.54);
        Assertions.assertEquals(10.54, testFilm.getModelRentalRate(), "The rental rate was incorrect");
    }

    @Test
    void testLength() {
        testFilm.setModelLength(200);
        Assertions.assertEquals(200, testFilm.getModelLength(), "The length was incorrect");
    }

    @Test
    void testReplacementCost() {
        testFilm.setModelReplacementCost(21.43);
        Assertions.assertEquals(21.43, testFilm.getModelReplacementCost(), "The replacement cost was incorrect");
    }

    @Test
    void testRating() {
        testFilm.setModelRating("G");
        Assertions.assertEquals("G", testFilm.getModelRating(), "The rating was incorrect");
    }

    @Test
    void testGetIntRatingG() {
        testFilm.setModelRating("G");
        Assertions.assertEquals(1, testFilm.getModelIntRating(), "The get Int rating method failed on G");
    }

    @Test
    void testGetIntRatingPG() {
        testFilm.setModelRating("PG");
        Assertions.assertEquals(2, testFilm.getModelIntRating(), "The get Int rating method failed on PG");
    }

    @Test
    void testGetIntRatingPG13() {
        testFilm.setModelRating("PG-13");
        Assertions.assertEquals(3, testFilm.getModelIntRating(), "The get int rating method failed on PG-13");
    }

    @Test
    void testGetIntRatingNC17() {
        testFilm.setModelRating("NC-17");
        Assertions.assertEquals(4, testFilm.getModelIntRating(), "The get int rating method failed on NC-17");
    }

    @Test
    void testGetIntRatingR() {
        testFilm.setModelRating("R");
        Assertions.assertEquals(5, testFilm.getModelIntRating(), "The get int rating method failed on R");
    }

    @Test
    void testGetIntRatingDEF() {
        testFilm.setModelRating("test");
        Assertions.assertEquals(0, testFilm.getModelIntRating(), "The get int rating method failed on the default case");
    }

    @Test
    void testCompareReleaseYearLess() {
        testFilm.setModelReleaseYear(2005);
        Assertions.assertEquals(0, testFilm.compareModelReleaseYear(newFilm), "The Release year comparison failed on less");
    }

    @Test
    void testCompareReleaseYearSame() {
        testFilm.setModelReleaseYear(2006);
        Assertions.assertEquals(1, testFilm.compareModelReleaseYear(newFilm), "The release year comparison failed on same");
    }

    @Test
    void testCompareReleaseYearHigher() {
        testFilm.setModelReleaseYear(2007);
        Assertions.assertEquals(2, testFilm.compareModelReleaseYear(newFilm), "The release year comparison failed on more");
    }

    @Test
    void testCompareLengthLess() {
        testFilm.setModelLength(89);
        Assertions.assertEquals(0, testFilm.compareModelLength(newFilm), "The length comparison failed on shorter");
    }

    @Test
    void testCompareLengthSame() {
        testFilm.setModelLength(90);
        Assertions.assertEquals(1, testFilm.compareModelLength(newFilm), "The length comparison failed on equal");
    }

    @Test
    void testCompareLengthMore() {
        testFilm.setModelLength(91);
        Assertions.assertEquals(2, testFilm.compareModelLength(newFilm), "The length comparison failed on longer");
    }


    @Test
    void testCompareRentalRateLess() {
        testFilm.setModelRentalRate(20.39);
        Assertions.assertEquals(0, testFilm.compareModelRentalRate(newFilm), "The rental rate comparison failed on lesser");
    }

    @Test
    void testCompareRentalRateSame() {
        testFilm.setModelRentalRate(20.4);
        Assertions.assertEquals(1, testFilm.compareModelRentalRate(newFilm), "The rental rate comparison failed on same");
    }

    @Test
    void testCompareRentalRateMore() {
        testFilm.setModelRentalRate(20.41);
        Assertions.assertEquals(2, testFilm.compareModelRentalRate(newFilm), "The rental rate comparison failed om more");
    }


    @Test
    void testCompareReplacementCostLess() {
        testFilm.setModelReplacementCost(10.52);
        Assertions.assertEquals(0, testFilm.compareModelReplacementCost(newFilm), "The replacement rate comparison failed on lower");
    }

    @Test
    void testCompareReplacementCostSame() {
        testFilm.setModelReplacementCost(10.53);
        Assertions.assertEquals(1, testFilm.compareModelReplacementCost(newFilm), "The replacement cost comparison failed on same");
    }

    @Test
    void testCompareReplacementCostMore() {
        testFilm.setModelReplacementCost(10.54);
        Assertions.assertEquals(2, testFilm.compareModelReplacementCost(newFilm), "The replacment cost comparison failed on larger");
    }

    @Test
    void testCompareRatingLess() {
        testFilm.setModelRating("G");
        Assertions.assertEquals(0, testFilm.compareModelRating(newFilm), "The rating comparison failed on lower");
    }

    @Test
    void testCompareRatingSame() {
        testFilm.setModelRating("PG");
        Assertions.assertEquals(1, testFilm.compareModelRating(newFilm), "The rating comparison failed on equal");
    }

    @Test
    void testCompareRatingMore() {
        testFilm.setModelRating("PG-13");
        Assertions.assertEquals(2, testFilm.compareModelRating(newFilm), "The rating comparison failed on more");
    }


    @Test
    void testAddActor() {

        Actor testActor = new Actor();
        newFilm.addModelActor(testActor);
        Assertions.assertEquals(1,newFilm.actors.size(),"The add actor method failed");
    }

    @Test
    void testAddCategory() {
        Category testCategory = new Category();
        newFilm.addModelCategory(testCategory);

        Assertions.assertEquals(1,newFilm.categories.size(),"The add category method failed");
    }


    @Test
    void testToString() {
        String testString = "Film id = 0 Title = test Description = test Release Year = 2006 RentalRate = 20.4 Length = 90 Replacement Cost = 10.53 rating = PG";
        Assertions.assertEquals(testString, newFilm.modelToString(), "The film to string method failed");
    }

}
