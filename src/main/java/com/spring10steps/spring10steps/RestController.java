package com.spring10steps.spring10steps;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(new Book(1l, "Spring cloud native", "O'Reily"));
    }
}
