package com.jpa.steps.jpa10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

//CommandLineRunner is executed at the application start
@Component
public class UserRepositoryLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        //User mock
        User user1 = new User("JPA user", "Read only");
        userRepository.save(user1);

        //Getting user by ID
        Optional<User> userWithId1 = userRepository.findById(1L);
        log.info("User by id: " + userWithId1);

        //Getting all users
        List<User> allUsers = userRepository.findAll();
        log.info("All users: " + allUsers);
    }
}
