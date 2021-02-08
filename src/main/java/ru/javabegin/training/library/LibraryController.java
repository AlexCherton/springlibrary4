package ru.javabegin.training.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibraryController {
    @GetMapping("/springlibrary")
    public String sayHello() {
        return "springlibrary";
    }
}
