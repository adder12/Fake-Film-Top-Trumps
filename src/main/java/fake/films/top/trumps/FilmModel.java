package fake.films.top.trumps;

import java.util.HashSet;
import java.util.Set;

public class FilmModel {

    int filmId;
    String title;
    String description;
    int releaseYear;
    double rentalRate;
    int length;
    double replacementCost;
    String rating;

    Set<Actor> actors;
    Set<Category> categories;


    //Constructors----------------------------------------------------------------------------------------
    public FilmModel(String title, String description, int releaseYear, double rentalRate, int length, double replacementCost, String rating) {
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

    public FilmModel() {
    }

    //Methods-----------------------------------------------------------------------------------------------
    public int getModelFilmId() {
        return this.filmId;
    }

    public String getModelTitle() {
        return this.title;
    }

    public String getModelDescription() {
        return this.description;
    }

    public int getModelReleaseYear() {
        return this.releaseYear;
    }

    public double getModelRentalRate() {
        return this.rentalRate;
    }

    public int getModelLength() {
        return this.length;
    }

    public double getModelReplacementCost() {
        return this.replacementCost;
    }

    public String getModelRating() {
        return this.rating;
    }

    public int getModelIntRating() {
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

    public void setModelTitle(String title) {
        this.title = title;
    }

    public void setModelDescription(String description) {
        this.description = description;
    }

    public void setModelReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setModelRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public void setModelLength(int length) {
        this.length = length;
    }

    public void setModelReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public void setModelRating(String rating) {
        this.rating = rating;
    }

    public int compareModelReleaseYear(FilmModel compFilm) {
        if (this.releaseYear < compFilm.getModelReleaseYear()) {
            return 0;
        } else if (this.releaseYear == compFilm.getModelReleaseYear()) {
            return 1;
        } else {
            return 2;
        }

    }

    public int compareModelLength(FilmModel compFilm) {
        if (this.length < compFilm.getModelLength()) {
            return 0;
        } else if (this.length == compFilm.getModelLength()) {
            return 1;
        } else {
            return 2;
        }
    }

    public int compareModelRentalRate(FilmModel compFilm) {
        if (this.rentalRate < compFilm.getModelRentalRate()) {
            return 0;
        } else if (this.rentalRate == compFilm.getModelRentalRate()) {
            return 1;
        } else {
            return 2;
        }
    }

    public int compareModelReplacementCost(FilmModel compFilm) {
        if (this.replacementCost < compFilm.getModelReplacementCost()) {
            return 0;
        } else if (this.replacementCost == compFilm.getModelReplacementCost()) {
            return 1;
        } else {
            return 2;
        }
    }

    public int compareModelRating(FilmModel compFilm) {
        if (this.getModelIntRating() < compFilm.getModelIntRating()) {
            return 0;
        } else if (this.getModelIntRating() == compFilm.getModelIntRating()) {
            return 1;
        } else {
            return 2;
        }
    }


    public void addModelActor(Actor actor) {
        actors.add(actor);
    }

    public void addModelCategory(Category category) {
        categories.add(category);
    }

    public String modelToString() {

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
