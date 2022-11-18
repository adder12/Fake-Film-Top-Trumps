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

    public String getCategoryModelName() {
        return this.categoryName;
    }

    public void setCategoryModelName(String name) {
        this.categoryName = name;
    }
}


