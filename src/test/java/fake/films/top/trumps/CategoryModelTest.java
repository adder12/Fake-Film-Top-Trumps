package fake.films.top.trumps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class CategoryModelTest {

        CategoryModel test = new CategoryModel();
        CategoryModel testTwo = new CategoryModel("test");

        @Test
        void testGetCategoryName() {
            test.setCategoryModelName("test");
            Assertions.assertEquals("test", test.getCategoryModelName(), "The category failed on Get category name");
        }


}
