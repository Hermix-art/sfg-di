package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext con = SpringApplication.run(SfgDiApplication.class, args); // spring creates context, basing on objects annotations, conf. files etc.

        System.out.println("\n--------------Primary");
        MyController myController = (MyController) con.getBean("myController"); // hey, spring, give me a controller bean from your context
        System.out.println(myController.sayHello());

        System.out.println("\n--------------Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) con.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("\n--------------Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) con.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreetings());

        System.out.println("\n--------------Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) con.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreetings());


    }

}
