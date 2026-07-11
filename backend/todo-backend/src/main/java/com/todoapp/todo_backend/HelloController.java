package com.todoapp.todo_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Princess! Backend is working!";
    }
    @GetMapping("/bye")
    public String sayBye(){
        return "Bye bye!";
    }
    
}
