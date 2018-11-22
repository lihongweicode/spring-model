package dppc.org.springzuul.model.eureke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringEurekeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekeApplication.class, args);
    }
}
