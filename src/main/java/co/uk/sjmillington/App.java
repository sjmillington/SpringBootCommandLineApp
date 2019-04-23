package co.uk.sjmillington;

import co.uk.sjmillington.service.GreetingService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@Log4j2
public class App implements CommandLineRunner {

    private GreetingService service;

    @Autowired
    public App(GreetingService service) {
        this.service = service;
    }

    @Override
    public void run(String... args){
        log.info("IN RUN");
        log.info(service.getGreeting());
    }

    public static void main(String[] args){
        SpringApplication.run(App.class);
        log.info("FINISHED");
    }
}
