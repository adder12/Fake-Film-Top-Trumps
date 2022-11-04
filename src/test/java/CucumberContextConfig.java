import FakeFilmTopTrumps.FakeFilmsTopTrumpsApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = FakeFilmsTopTrumpsApplication.class)

public class CucumberContextConfig {
}
