import Fake.Films.top.trumps.ActorRepository;
import Fake.Films.top.trumps.CategoryRepository;
import Fake.Films.top.trumps.FilmRepository;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration


public class MockitoTestConfig {
    @Bean
    @Primary
    public ActorRepository actorRepo() {

        return Mockito.mock(ActorRepository.class);

    }

    public FilmRepository filmRepo() {
        return Mockito.mock(FilmRepository.class);
    }

    public CategoryRepository categoryRepo() {

        return Mockito.mock(CategoryRepository.class);
    }

}
