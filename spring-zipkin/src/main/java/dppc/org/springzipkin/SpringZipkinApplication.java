package dppc.org.springzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

//@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class SpringZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringZipkinApplication.class, args);
    }
}
