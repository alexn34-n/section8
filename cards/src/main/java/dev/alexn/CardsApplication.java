package dev.alexn;


import dev.alexn.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.alexbank.cards.controller") })
@EnableJpaRepositories("com.alexbank.cards.repository")
@EntityScan("com.alexbank.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@OpenAPIDefinition(
        info = @Info(
                title = "Cards microservice REST API Documentation",
                description = "AlexBank Cards microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Alex",
                        email = "alexr@alexnbank.com",
                        url = "https://www.alexbank.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.alexbank.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "AlexBank Cards microservice REST API Documentation",
                url = "https://www.alexbank.com/swagger-ui.html"
        )
)
public class CardsApplication {

    public static void main(String[] args) {
        run(CardsApplication.class, args);
    }
}