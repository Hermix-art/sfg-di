package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Herman Kulik
 */
@Service
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "Hi folks from Setter Service";
    }
}
