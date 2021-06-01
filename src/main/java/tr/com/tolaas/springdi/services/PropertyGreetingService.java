package tr.com.tolaas.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - Property Injected Greeting Service";
    }
}
