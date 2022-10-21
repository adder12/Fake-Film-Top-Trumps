package Fake.Films.top.trumps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin
public class FakeFilmsTopTrumpsApplication {
    @Autowired
    private ActorRepository actorRepo;

    public FakeFilmsTopTrumpsApplication(ActorRepository actorRepo) {
        this.actorRepo = actorRepo;
    }

    public static void main(String[] args) {

        SpringApplication.run(FakeFilmsTopTrumpsApplication.class, args);


    }

    @GetMapping("/allActors")
    public @ResponseBody
    Iterable<Actor> getAllActors() {
        return actorRepo.findAll();
    }

    @GetMapping("/singleActor/{id}")


    @PostMapping("/newActor")
    @ResponseBody


    public Actor createActor(@RequestBody Actor actor) {

        return actorRepo.save(actor);

    }

    //@PutMapping("/updateActor")
    @DeleteMapping("/deleteActor/{id}")
    void deleteEmployeeByID(@PathVariable int id) {
        actorRepo.deleteById(id);
    }

}
