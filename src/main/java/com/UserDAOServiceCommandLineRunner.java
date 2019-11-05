package com.jpa.steps.jpa10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//CommandLineRunner is executed at the application start
@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {

        //Users mock
        User user1 = new User("DAO user 1", "Admin");
        User user2 = new User("DAO user 2", "Read only");

        long insert1 = userDAOService.insert(user1);
        long insert2 = userDAOService.insert(user2);
    }
}
