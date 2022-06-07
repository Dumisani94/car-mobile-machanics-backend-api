package za.ac.tut.car.mobile.machanics.services;

import org.springframework.stereotype.Service;
import za.ac.tut.car.mobile.machanics.enities.User;
import za.ac.tut.car.mobile.machanics.repositories.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String username, String password) {
        return userRepository.login(username,password);
    }

    @Override
    public User registerUser(User user) {
        User results = retrieveUserByEmail(user.getEmail());
        if(results != null){
            return null;
        }
        return userRepository.save(user);
    }

    @Override
    public User retrieveUserByEmail(String email) {
        return userRepository.retrieveUserByEmail(email);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByUserId(Long userId) {
        return userRepository.retrieveUserUsingId(userId);
    }

    @Override
    public List<User> retrieveAll() {
        return userRepository.findAll();
    }
}
