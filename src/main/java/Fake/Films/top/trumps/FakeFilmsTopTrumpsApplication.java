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

    public FakeFilmsTopTrumpsApplication(ActorRepository actorRepo) {
        this.actorRepo = actorRepo;
        this.filmRepo = filmRepo;
    }


    public static void main(String[] args) {

        SpringApplication.run(FakeFilmsTopTrumpsApplication.class, args);


    }

    @GetMapping("allFilms")
    public @ResponseBody
    Iterable<Film> getAllFilms() {
        return filmRepo.findAll();
    }

    @GetMapping("/allActors")
    public @ResponseBody
    Iterable<Actor> getAllActors() {
        return actorRepo.findAll();
    }


    @PostMapping("/newActor")

    public Actor createActor(@RequestBody Actor actor) {
        return actorRepo.save(actor);
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
