package ru.kpfu.itis.semestrovka.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.semestrovka.dto.SignUpDto;

@Aspect
@Component
@Slf4j
public class AuthAspect {

    private final Logger log = LoggerFactory.getLogger(RegistrationAspect.class);

    @After(value = "execution(* ru.kpfu.itis.semestrovka.controllers.LogInController.getLogInPage(*))")
    public void getPage(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        SignUpDto user = (SignUpDto) args[0];
        log.info("Пользователь - открыл страницу авторизации");
    }

}
