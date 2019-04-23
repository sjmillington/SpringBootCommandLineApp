package co.uk.sjmillington;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@Log4j2
public class App implements CommandLineRunner {

    @Override
    public void run(String... args){
        log.info("IN RUN");
    }

    public static void main(String[] args){
        SpringApplication.run(App.class);

        log.info("FINISHED");
    }
}
