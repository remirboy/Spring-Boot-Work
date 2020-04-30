package ru.kpfu.itis.semestrovka.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kpfu.itis.semestrovka.dto.UserDto;

import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/")
    public String getMainPage(ModelMap map, Authentication authentication) {
        map.addAttribute("authentication",authentication);
        return "start_page";
    }
}
