package fake.films.top.trumps;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "film")
public class Film {
//Attributes--------------------------------------------------------

    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmId;
    @Column(name = "title")
    String title;
    @Column(name = "description")
    String description;
    @Column(name = "release_year")
    int releaseYear;
    @Column(name = "rental_rate")
    double rentalRate;
    @Column(name = "length")
    int length;
    @Column(name = "replacement_cost")
    double replacementCost;
    @Column(name = "rating")
    String rating;

    @ManyToMany
    @JoinTable(name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    Set<Actor> actors;

    @ManyToMany
    @JoinTable(name = "film_category", joinColumns = @JoinColumn(name = "film_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    Set<Category> categories;


    //Constructors----------------------------------------------------------------------------------------
    public Film(String title, String description, int releaseYear, double rentalRate, int length, double replacementCost, String rating) {
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.actors = new HashSet<>();
        this.categories = new HashSet<>();
    }

    public Film() {
    }

    //Methods-----------------------------------------------------------------------------------------------
    public int getFilmId() {
        return this.filmId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public double getRentalRate() {
        return this.rentalRate;
    }

    public int getLength() {
        return this.length;
    }

    public double getReplacementCost() {
        return this.replacementCost;
    }

    public String getRating() {
        return this.rating;
    }

    public int getIntRating() {
        int intRating = 0;
        switch (this.rating) {
            case "G":
                intRating = 1;
                break;
            case "PG":
                intRating = 2;
                break;
            case "PG-13":
                intRating = 3;
                break;
            case "NC-17":
                intRating = 4;
                break;
            case "R":
                intRating = 5;
                break;

            default:
                break;
        }
        return intRating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int compareLength(Film compFilm) {
        if (this.length < compFilm.getLength()) {
            return 0;
        } else if (this.length == compFilm.length) {
            return 1;
        } else {
            return 2;
        }
    }

    public int compareRentalRate(Film compFilm) {
        if (this.rentalRate < compFilm.getRentalRate()) {
            return 0;
        } else if (this.rentalRate == compFilm.getRentalRate()) {
            return 1;
        } else {
            return 2;
        }
    }

    public int compareReplacementCost(Film compFilm) {
        if (this.replacementCost < compFilm.getReplacementCost()) {
            return 0;
        } else if (this.replacementCost == compFilm.getReplacementCost()) {
            return 1;
        } else {
            return 2;
        }
    }

    public int compareRating(Film compFilm) {
        if (this.getIntRating() < compFilm.getIntRating()) {
            return 0;
        } else if (this.getIntRating() == compFilm.getIntRating()) {
            return 1;
        } else {
            return 2;
        }
    }


    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public String toString() {

        StringBuilder output = new StringBuilder();
        output.append("Film id = ");
        output.append(this.filmId);
        output.append(" Title = ");
        output.append(this.title);
        output.append(" Description = ");
        output.append(this.description);
        output.append(" Release Year = ");
        output.append(this.releaseYear);
        output.append(" RentalRate = ");
        output.append(this.rentalRate);
        output.append(" Length = ");
        output.append(this.length);
        output.append(" Replacement Cost = ");
        output.append(this.replacementCost);
        output.append(" rating = ");
        output.append(this.rating);

        return output.toString();
    }
}
