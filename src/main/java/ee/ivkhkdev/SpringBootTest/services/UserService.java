package ee.ivkhkdev.SpringBootTest.services;

import ee.ivkhkdev.SpringBootTest.entities.User;
import ee.ivkhkdev.SpringBootTest.interfaces.AppHelper;
import ee.ivkhkdev.SpringBootTest.interfaces.AppRepository;
import ee.ivkhkdev.SpringBootTest.interfaces.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements AppService {
    private final AppHelper<User> userAppHelper;
    private final AppRepository<User> userRepository;

    @Autowired
    public UserService(AppHelper<User> userAppHelper, AppRepository<User> userRepository) {
        this.userAppHelper = userAppHelper;
        this.userRepository = userRepository;
    }

    @Override
    public boolean add() {
        User user = userAppHelper.create();
        if (user == null) {
            return false;
        }
        return userRepository.save(user);
    }
}
