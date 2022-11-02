package Fake.Films.top.trumps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    Category test = new Category();

    @Test
    void testGetCategoryName() {
        test.setCategoryName("test");
        Assertions.assertEquals("test", test.getCategoryName(), "The category failed on Get category name");
    }
}
