package za.ac.tut.car.mobile.machanics.services;

import org.springframework.stereotype.Service;
import za.ac.tut.car.mobile.machanics.enities.Technician;
import za.ac.tut.car.mobile.machanics.enities.User;
import za.ac.tut.car.mobile.machanics.repositories.TechnicianRepository;
import za.ac.tut.car.mobile.machanics.repositories.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final TechnicianRepository technicianRepository;

    public UserServiceImpl(UserRepository userRepository, TechnicianRepository technicianRepository) {
        this.userRepository = userRepository;
        this.technicianRepository = technicianRepository;
    }

    @Override
    public User login(String username, String password) {
        return userRepository.login(username, password);
    }

    @Override
    public User registerUser(User user) {
        User results = retrieveUserByEmail(user.getEmail());
        if (results != null) {
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

    @Override
    public List<User> retrieveUnapprovedMechanics() {
        return userRepository.findUnapprovedMechanics();
    }

    @Override
    public User deleteUser(User user) {
        userRepository.delete(user);
        return user;
    }
}
