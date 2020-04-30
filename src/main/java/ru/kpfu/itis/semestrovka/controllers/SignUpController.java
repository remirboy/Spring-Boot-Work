package ru.kpfu.itis.semestrovka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;

import ru.kpfu.itis.semestrovka.dto.SignUpDto;
import ru.kpfu.itis.semestrovka.models.User;
import ru.kpfu.itis.semestrovka.services.SignUpService;

import javax.validation.ConstraintViolationException;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService service;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "user_form";
    }

    @PostMapping("/signUp")
    public String signUp(SignUpDto form) {
        try {
            User user = service.signUp(form);
            return "redirect:/signIn";
        } catch (javax.validation.ConstraintViolationException | NullPointerException e) {
            return "registration_faile";
        }

    }
}