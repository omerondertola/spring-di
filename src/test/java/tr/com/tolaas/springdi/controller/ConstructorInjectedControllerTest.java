package tr.com.tolaas.springdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tr.com.tolaas.springdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        GreetingServiceImpl greetingService = new GreetingServiceImpl();
        controller = new ConstructorInjectedController(greetingService);
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}