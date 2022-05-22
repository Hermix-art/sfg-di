package guru.springframework.sfgdi.services;

/**
 * @author Herman Kulik
 */
public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "Hi folks";
    }
}
