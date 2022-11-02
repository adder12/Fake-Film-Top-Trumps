package Fake.Films.top.trumps;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "category")

public class Category {
    //Attributes------------------------------------------------------
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int categoryId;
    @Column(name = "name")
    String categoryName;


    @ManyToMany(mappedBy = "categories")
    Set<Film> films;

//Constructors----------------------------------------------------------------------

    public Category() {

    }

    public Category(String name) {
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
