import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Application main class. Start
 */
@SpringBootApplication
//@EntityScan({"com.betrybe.agrix.ebytr.staff.entity"})
//@EnableJpaRepositories({"com.betrybe.agrix.ebytr.staff.repository"})
@ComponentScan("com.betrybe.agrix.src.main.java")
public class AgrixApplication {

  public static void main(String[] args) {
    SpringApplication.run(AgrixApplication.class, args);
  }

}
