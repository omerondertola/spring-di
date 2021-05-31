package tr.com.tolaas.springdi.controller;

import org.springframework.stereotype.Controller;
import tr.com.tolaas.springdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    protected final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayHello();
    }
}
