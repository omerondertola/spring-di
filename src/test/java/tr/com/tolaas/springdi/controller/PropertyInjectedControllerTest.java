package tr.com.tolaas.springdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tr.com.tolaas.springdi.services.ConstructorGreetingService;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller = new PropertyInjectedController();

    @BeforeEach
    void setUp() {
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void test() {
        System.out.println(controller.getGreeting()+"");
        assertNotNull(controller.getGreeting());
    }
}