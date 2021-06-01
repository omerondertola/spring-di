package tr.com.tolaas.springdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import tr.com.tolaas.springdi.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    protected GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }
}
