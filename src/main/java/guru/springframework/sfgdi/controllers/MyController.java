package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Herman Kulik
 */
@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Helloooo!");
        return "Hi folks";
    }
}
