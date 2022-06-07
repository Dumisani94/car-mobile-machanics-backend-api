package za.ac.tut.car.mobile.machanics.services;

import org.springframework.stereotype.Service;
import za.ac.tut.car.mobile.machanics.enities.User;

import java.util.List;

@Service
public interface UserService {
    User login(String username, String password);

    User registerUser(User user);

    User retrieveUserByEmail(String email);

    User updateUser(User user);

    User findByUserId(Long userId);

    List<User> retrieveAll();
}
