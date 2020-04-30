package ru.kpfu.itis.semestrovka.services;

import lombok.Builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;
import ru.kpfu.itis.semestrovka.dto.SignUpDto;
import ru.kpfu.itis.semestrovka.models.User;
import ru.kpfu.itis.semestrovka.repositories.UserRepository;

import java.sql.SQLIntegrityConstraintViolationException;


@Component
@Builder
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UserRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User signUp(SignUpDto form) {
            User user = User.builder()
                    .email(form.getEmail())
                    .hashPassword(passwordEncoder.encode(form.getPassword()))
                    .gender(form.getGender())
                    .country(form.getCountry())
                    .date(form.getDate())
                    .build();
            usersRepository.save(user);
            return user;

    }
}