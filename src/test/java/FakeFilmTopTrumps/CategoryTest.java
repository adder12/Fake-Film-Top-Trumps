package FakeFilmTopTrumps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    Category test = new Category();
    Category testTwo = new Category("test");

    @Test
    void testGetCategoryName() {
        test.setCategoryName("test");
        Assertions.assertEquals("test", test.getCategoryName(), "The category failed on Get category name");
    }
}
