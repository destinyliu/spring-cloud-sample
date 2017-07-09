import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author destinyliu
 */
@EnableAutoConfiguration
@EnableConfigServer
@EnableWebMvc
public class ConfigServerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
