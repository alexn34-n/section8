package dev.alexn;

import dev.alexn.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScans({ @ComponentScan("dev.alexn.controller")
//@EnableJpaRepositories("com.dev.alexn.repository")
//@EntityScan("dev.alexn.model")

@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})

@OpenAPIDefinition(
        info=@Info(
                title = "Accounts microservice REST API Documentation",
                description = "AlexBank Accounts microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Alex",
                        email = "alex@alexbank.com",
                        url = "https://www.alexbank.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.alexbank.com"
                )
                ),
                externalDocs = @ExternalDocumentation(
                        description =  "AlexBank Accounts microservice REST API Documentation",
                        url = "https://www.alexbank.com/swagger-ui.html"
                )

)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}