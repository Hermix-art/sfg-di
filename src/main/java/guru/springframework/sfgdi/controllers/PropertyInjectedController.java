package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * @author Herman Kulik
 */
public class PropertyInjectedController {
    GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayHello();
    }
}
