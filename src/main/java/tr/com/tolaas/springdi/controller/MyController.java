package tr.com.tolaas.springdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tr.com.tolaas.springdi.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    @Autowired
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println(greetingService.sayHello());
        return "Hi to everyone :)";
    }
}
