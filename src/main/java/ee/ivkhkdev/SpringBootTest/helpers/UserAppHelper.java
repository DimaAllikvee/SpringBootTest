package ee.ivkhkdev.SpringBootTest.helpers;

import ee.ivkhkdev.SpringBootTest.entities.User;
import ee.ivkhkdev.SpringBootTest.interfaces.AppHelper;
import org.springframework.stereotype.Component;

@Component
public class UserAppHelper implements AppHelper<User> {
    @Override
    public User create() {
        return new User();
    }
}
