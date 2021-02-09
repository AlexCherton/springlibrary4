package ru.javabegin.training.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LibraryController {
    @GetMapping("/springlibrary")
    public String sayHello() {
        return "springlibrary";
    }

}
