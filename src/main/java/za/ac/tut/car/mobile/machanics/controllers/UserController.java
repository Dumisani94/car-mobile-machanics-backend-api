package za.ac.tut.car.mobile.machanics.controllers;

import org.springframework.web.bind.annotation.*;
import za.ac.tut.car.mobile.machanics.enities.User;
import za.ac.tut.car.mobile.machanics.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
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
