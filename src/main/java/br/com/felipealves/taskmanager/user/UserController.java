package br.com.felipealves.taskmanager.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public UserModel create(@RequestBody UserModel userModel) {
        var user = this.userRepository.findByUsername(userModel.getUsername());

        if (user != null) {
            System.out.println("Usuário existente!");
            return null;
        }

        var userCreated = this.userRepository.save(userModel);
        return userCreated;
    }
}
