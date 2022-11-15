package fake.films.top.trumps;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FilmRepository extends JpaRepository<Film, Integer> {

@Query(nativeQuery= true, value = "SELECT sakila.film.* FROM sakila.film INNER JOIN sakila.film_actor ON sakila.film.film_id = sakila.film_actor.film_id INNER JOIN sakila.actor ON sakila.actor.actor_id = sakila.film_actor.actor_id") Film getAllFilmAndActor();

}

