package pl.tlis.springeurekaproducer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringEurekaProducerApplication {

    @Value("${spring.application.instance_id}")
    private String applicationInstanceId;
    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("hello")
    public String hello() {
        return "Dzień dobry jestem instancją " + applicationInstanceId + " aplikacji " + applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaProducerApplication.class, args);
    }

}
