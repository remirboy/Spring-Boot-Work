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
import ru.kpfu.itis.semestrovka.dto.ItemDto;
import ru.kpfu.itis.semestrovka.dto.SignUpDto;
import ru.kpfu.itis.semestrovka.dto.UserDto;

@Aspect
@Component
@Slf4j
public class ItemAspect {
    private final Logger log = LoggerFactory.getLogger(RegistrationAspect.class);

    @After(value = "execution(* ru.kpfu.itis.semestrovka.controllers.ItemsController.getItemsPage(*))")
    public void getItemsPage(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        log.info("Пользователь  открыл страницу статей");
    }

    @After(value = "execution(* ru.kpfu.itis.semestrovka.controllers.ItemsController.getItemPage(*))")
    public void getItemPage(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Long id = (Long) args[0];
        log.info("Пользователь открыл статью с id"+ id);
    }


    @After(value = "execution(* ru.kpfu.itis.semestrovka.controllers.ItemsController.getItemCreate(*))")
    public void create(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();;
        log.info("Пользователь - создает новую статью");
    }

    @AfterReturning(value = "execution(* ru.kpfu.itis.semestrovka.controllers.ItemsController.getCreateItem(*))")
    public void after(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        ItemDto item = (ItemDto) args[0];
        log.info("Новая статья"+item+"создана");
    }
}
