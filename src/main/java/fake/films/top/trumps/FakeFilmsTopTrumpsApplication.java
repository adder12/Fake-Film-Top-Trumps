package fake.films.top.trumps;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin(origins = {"http://localhost:8080","http://localhost:3000"})
public class FakeFilmsTopTrumpsApplication {
    @Autowired
    public ActorRepository actorRepo;
    @Autowired
    public FilmRepository filmRepo;
    @Autowired
    public CategoryRepository categoryRepo;

    public FakeFilmsTopTrumpsApplication(ActorRepository actorRepo, FilmRepository filmRepo, CategoryRepository categoryRepo) {
        this.actorRepo = actorRepo;
        this.filmRepo = filmRepo;
        this.categoryRepo = categoryRepo;
    }

    public static void main(String[] args) {SpringApplication.run(FakeFilmsTopTrumpsApplication.class, args);}

    @GetMapping("/allFilms")
    public @ResponseBody Iterable<Film> getAllFilms() {
        return filmRepo.findAll();
    }

    @GetMapping("/filmCount")
    public int getFilmCount(){

int count =(int) filmRepo.count();

        return count;
    }

    @GetMapping("/singleFilm/{id}")
    public Film getSingleFilm(@PathVariable(value = "id") int filmId) {
        return filmRepo.findById(filmId).orElseThrow(() -> new ResourceAccessException("Film not found at index " + filmId));
    }

    @PostMapping("/newFilm")
    public void createFilm(@RequestBody Film film) {
        filmRepo.save(film);
    }

    @PutMapping("/updateFilm/{id}")
    public void updateFilm(@PathVariable(value = "id") int filmId, @RequestBody Film filmDetails) {
        Film film = filmRepo.findById(filmId).orElseThrow(() -> new ResourceAccessException("Film not found at " + filmId));
        film.setTitle(filmDetails.getTitle());
        film.setDescription(filmDetails.getDescription());
        film.setReleaseYear(filmDetails.getReleaseYear());
        film.setRentalRate(filmDetails.getRentalRate());
        film.setLength(filmDetails.getLength());
        film.setReplacementCost(filmDetails.getReplacementCost());
        film.setRating(filmDetails.getRating());
        filmRepo.save(film);
    }

    @DeleteMapping("/deleteFilm/{id}")
    void deleteFilm(@PathVariable int id) {
        filmRepo.deleteById(id);
    }

    @GetMapping("/allActors")
    public @ResponseBody
    Iterable<Actor> getAllActors() {
        return actorRepo.findAll();
    }

    @GetMapping("/singleActor/{id}")
    public Actor getSingleActor(@PathVariable(value = "id") int actorId) {
        return actorRepo.findById(actorId).orElseThrow(() -> new ResourceAccessException("Actor not found at " + actorId));
    }

    @PostMapping("/newActor")
    public void createActor(@RequestBody Actor actor) {
        actorRepo.save(actor);
    }

    @PutMapping("/updateActor/{id}")
    public void updateActor(@PathVariable(value = "id") int actorId, @RequestBody Actor actorDetails) {
        Actor actor = actorRepo.findById(actorId).orElseThrow(() -> new ResourceAccessException("Actor not found at " + actorId));
        actor.setFirstName(actorDetails.getFirstName());
        actor.setLastName(actorDetails.getLastName());
        actorRepo.save(actor);
    }

    @DeleteMapping("/deleteActor/{id}")
    void deleteActor(@PathVariable int id) {
        actorRepo.deleteById(id);
    }

    @GetMapping("/allCategories")
    public @ResponseBody
    Iterable<Category> getAllCategories() {

        return categoryRepo.findAll();
    }

    @GetMapping("/category/{id}")
    public Category getSingleCategory(@PathVariable(value = "id") int id) {
        return categoryRepo.findById(id).orElseThrow(() -> new ResourceAccessException("Category not found at " + id));
    }

    @PostMapping("/newCategory")
    public void createCategory(@RequestBody Category category) {
        categoryRepo.save(category);
    }

    @PutMapping("updateCategory/{id}")
    public void updateCategory(@PathVariable(value = "id") int catId, @RequestBody String newName) {
        Category category = categoryRepo.findById(catId).orElseThrow(() -> new ResourceAccessException("Category not found at " + catId));

        category.setCategoryName(newName);
        categoryRepo.save(category);
    }

    @DeleteMapping("deleteCategory/{id}")
    void deleteCategory(@PathVariable int id) {
        categoryRepo.deleteById(id);
    }

}






