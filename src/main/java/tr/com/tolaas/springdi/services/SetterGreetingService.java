package tr.com.tolaas.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - Setter Injected Greeting Service";
    }
}
