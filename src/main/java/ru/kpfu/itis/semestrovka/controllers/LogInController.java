package ru.kpfu.itis.semestrovka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.UriComponentsBuilder;
import ru.kpfu.itis.semestrovka.dto.SignUpDto;
import ru.kpfu.itis.semestrovka.dto.UserDto;
import ru.kpfu.itis.semestrovka.services.UserService;

import java.util.List;

@Controller
public class LogInController {

    @Autowired
    private UserService usersService;


    @GetMapping("/signIn")
    public String getLogInPage() {
        return "log_in";
    }

//    @GetMapping("/users")
//    public String getUsersPage(Model model) {
//        List<UserDto> users = usersService.getAllUsers();
//        model.addAttribute("users", users);
//        return "user_list";
//    }

    @PostMapping("/signIn")
    public String signUp(SignUpDto form, BindingResult result, RedirectAttributes redirectAttributes) {
//
//        if (!result.hasErrors()) {
//            try{
//                service.signUp(form);
//                redirectAttributes.addFlashAttribute("message", "You has been registered successfully");
//                redirectAttributes.addFlashAttribute("messageType", "success");
//                return "redirect:" + UriComponentsBuilder.fromPath("/").build();
//            }
//            catch(DuplicateKeyException ex){
//                result.rejectValue("username", "entry.duplicate", "There is account with such email already.");
//            }
//        }
        return "redirect:/signIn";
  }
}
