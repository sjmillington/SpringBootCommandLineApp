package co.uk.sjmillington;

import co.uk.sjmillington.service.GreetingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    @Autowired
    private GreetingService service;

    @Test
    public void contextLoads() throws Exception{
        assertThat(service).isNotNull();
    }


}