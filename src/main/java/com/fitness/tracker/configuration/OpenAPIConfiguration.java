package com.fitness.tracker.configuration;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfiguration {

    @Bean
    public OpenAPI defineOpenApi() {
        Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("Fiteness Tracker API Documentation");

        Contact myContact = new Contact();
        myContact.setName("Meghana Bhat");
        myContact.setEmail("your.email@gmail.com");

        Info information = new Info()
                .title("Fiteness Tracker API")
                .version("1.0")
                .description("This API exposes endpoints to manage fitness tracker APIs.")
                .contact(myContact);
        return new OpenAPI().info(information).servers(List.of(server));
    }
}
