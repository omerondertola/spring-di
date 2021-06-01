package tr.com.tolaas.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tr.com.tolaas.springdi.controller.*;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);

        LanguageAwareController languageAwareController = (LanguageAwareController) context.getBean("languageAwareController");
        System.out.println(languageAwareController.getLabelString("hello"));

        MyController ctrl = (MyController) context.getBean("myController");
        String msg = ctrl.sayHello();
        System.out.println("Bean Says:" + msg);

        System.out.println("**** Property Injection ****");
        PropertyInjectedController controller = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(controller.getGreeting());

        System.out.println("**** Setter Injection ****");
        SetterInjectedController sicontroller = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(sicontroller.getGreeting());

        System.out.println("**** Constructor Injection ****");
        ConstructorInjectedController concontroller = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(concontroller.getGreeting());
    }

}
