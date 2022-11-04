package fake.films.top.trumps;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM sakila.actor WHERE sakila.actor.actor_id = ?1")
    Actor getActorById(int id);

}
