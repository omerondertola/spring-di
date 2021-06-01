package tr.com.tolaas.springdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tr.com.tolaas.springdi.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        ConstructorGreetingService greetingService = new ConstructorGreetingService();
        controller = new ConstructorInjectedController(greetingService);
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}