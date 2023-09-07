package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.BoundedContext376Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext376Application.class })
public class CucumberSpingConfiguration {}
