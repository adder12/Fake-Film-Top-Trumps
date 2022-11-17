package fake.films.top.trumps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryModelTest {

        CategoryModel test = new CategoryModel();
        CategoryModel testTwo = new CategoryModel("test");

        @Test
        void testGetCategoryName() {
            test.setCategoryName("test");
            Assertions.assertEquals("test", test.getCategoryName(), "The category failed on Get category name");
        }


}
