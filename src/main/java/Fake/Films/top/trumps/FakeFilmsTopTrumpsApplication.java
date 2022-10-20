package Fake.Films.top.trumps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
//@PostMapping
	
//@PutMapping
//	@DeleteMapping
}
