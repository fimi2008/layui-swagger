package io.github.fimi2008;

import io.github.fimi2008.swagger.core.EnableSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger
public class SwaggerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerTestApplication.class, args);
    }
}
