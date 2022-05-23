package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Herman Kulik
 */
@Controller
public class MyController {
    private final GreetingService greetingService;

    //here we don't specify which Service bean should be used, so it will use the one, with @Primary annotation
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
