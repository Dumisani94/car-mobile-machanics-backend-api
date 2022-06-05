package za.ac.tut.car.mobile.machanics.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import za.ac.tut.car.mobile.machanics.enities.User;
import za.ac.tut.car.mobile.machanics.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {

    private final UserService userService;
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login/username/{username}/password/{password}")
    public User login(@PathVariable("username") String username,@PathVariable("password")  String password){
        log.info("username : {}, Password: {}",username,password);
        return userService.login(username,password);
    }

    @GetMapping("/all")
    public List<User> findAll(){
        return userService.retrieveAll();
    }

    @PostMapping("/update")
    public User registerUser(@RequestBody User user){
        return userService.registerUser(user);
    }

    @PutMapping("/register")
    public User modifyUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @GetMapping("/retrieve/id/{id}")
    public User retrieveUserUsingIdNumber(@PathVariable("id") String id){
        return userService.findByUserId(Long.parseLong(id));
    }
}
