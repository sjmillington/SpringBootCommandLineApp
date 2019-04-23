package co.uk.sjmillington.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {GreetingService.class})
public class GreetingServiceTest {

    @Autowired
    private GreetingService service;

    @Test
    public void checkGreetingReturnsCorrectString() {
        assertEquals("Hello Mars!", service.getGreeting());
    }
}