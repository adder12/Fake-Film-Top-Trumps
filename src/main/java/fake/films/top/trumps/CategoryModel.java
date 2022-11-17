package fake.films.top.trumps;
import java.util.Set;
public class CategoryModel {



int categoryId;
String categoryName;
Set<Film> films;


//Constructors----------------------------------------------------------------------

    public CategoryModel() {

    }

    public CategoryModel(String name) {
        this.categoryName = name;
    }

//Methods------------------------------------------------------------------------

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String name) {
        this.categoryName = name;
    }
}


