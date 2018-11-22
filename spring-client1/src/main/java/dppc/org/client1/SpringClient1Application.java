package dppc.org.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringClient1Application.class, args);
    }
}
