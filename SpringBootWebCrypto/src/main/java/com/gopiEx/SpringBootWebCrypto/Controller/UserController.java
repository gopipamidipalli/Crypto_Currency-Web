package com.gopiEx.SpringBootWebCrypto.Controller;

import com.gopiEx.SpringBootWebCrypto.Model.UserData;
import com.gopiEx.SpringBootWebCrypto.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("register")
    public String register(@RequestBody UserData userData){
        if(userRepository.existsById(userData.getUsername())){
            return "User name is already Exists";
        }else
         userRepository.save(userData);
        return "User Register Successfully";
    }
    @PostMapping("login")
    public String login(@RequestBody UserData loginData){
        Optional<UserData> uData = userRepository.findById(loginData.getUsername());
        if(uData.isPresent()){
            UserData userData = uData.get();
            if(userData.getPassword().equals(loginData.getPassword())){
                return "Login Success";
            }
        }
        return "Invalid Username and Password";


    }
}
