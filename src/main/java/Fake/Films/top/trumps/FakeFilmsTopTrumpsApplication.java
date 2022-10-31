package Fake.Films.top.trumps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin
public class FakeFilmsTopTrumpsApplication {
    @Autowired
    private ActorRepository actorRepo;
    private FilmRepository filmRepo;

    public FakeFilmsTopTrumpsApplication(ActorRepository actorRepo, FilmRepository filmRepo) {
        this.actorRepo = actorRepo;
        this.filmRepo = filmRepo;
    }


    public static void main(String[] args) {

        SpringApplication.run(FakeFilmsTopTrumpsApplication.class, args);


    }

    @GetMapping("/allFilms")
    public @ResponseBody
    Iterable<Film> getAllFilms() {
        return filmRepo.findAll();
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
    public ResponseEntity<Film> updateFilm(@PathVariable(value = "id") int filmId, @RequestBody Film filmDetails) {
        Film film = filmRepo.findById(filmId).orElseThrow(() -> new ResourceAccessException("Actor not found at " + filmId));

        film.setTitle(filmDetails.getTitle());
        film.setDescription(filmDetails.getDescription());
        film.setReleaseYear(filmDetails.getReleaseYear());
        film.setRentalRate(filmDetails.getRentalRate());
        film.setLength(filmDetails.getLength());
        film.setReplacementCost(filmDetails.getReplacementCost());
        film.setRating(filmDetails.getRating());

        final Film updatedActor = filmRepo.save(film);
        return ResponseEntity.ok(updatedActor);
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
    public ResponseEntity<Actor> updateActor(@PathVariable(value = "id") int actorId, @RequestBody Actor actorDetails) {
        Actor actor = actorRepo.findById(actorId).orElseThrow(() -> new ResourceAccessException("Actor not found at " + actorId));

        actor.setFirstName(actorDetails.getFirstName());
        actor.setLastName(actorDetails.getLastName());
        final Actor updatedActor = actorRepo.save(actor);
        return ResponseEntity.ok(updatedActor);
    }

    @DeleteMapping("/deleteActor/{id}")
    void deleteEmployeeByID(@PathVariable int id) {
        actorRepo.deleteById(id);
    }

}






