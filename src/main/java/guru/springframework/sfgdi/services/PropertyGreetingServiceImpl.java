package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Herman Kulik
 */
@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hi folks from Property Service";
    }

}
