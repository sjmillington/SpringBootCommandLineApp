package co.uk.sjmillington.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:message.properties")
public class GreetingService {

    @Value( "${service.greeting.message}" )
    private String message;

    public String getGreeting(){
        return message;
    }

}
