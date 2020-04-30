package ru.kpfu.itis.semestrovka.controllers;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kpfu.itis.semestrovka.dto.AnswerDto;
import ru.kpfu.itis.semestrovka.dto.ItemDto;
import org.springframework.security.core.Authentication;

import ru.kpfu.itis.semestrovka.models.Answer;
import ru.kpfu.itis.semestrovka.models.Comment;
import ru.kpfu.itis.semestrovka.models.Item;
import ru.kpfu.itis.semestrovka.models.User;
import ru.kpfu.itis.semestrovka.services.AnswerService;
import ru.kpfu.itis.semestrovka.services.CommentService;
import ru.kpfu.itis.semestrovka.services.ItemService;

import javax.validation.UnexpectedTypeException;
import java.util.List;
import java.util.Optional;

@Controller
public class ItemsController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private AnswerService answerService;

//    @PreAuthorize("isAuthenticated()")
    @GetMapping("/items")
    public String getItemsPage(Model model) {
        List<ItemDto> items = itemService.getAllItems();
        model.addAttribute("items", items);
        return "item_list";
    }

    @GetMapping("/items/{id}")
    public String getItemPage(@PathVariable("id") Long id, ModelMap map,Model model) {
        Item item = itemService.getItem(id);
        List<Comment> comments = commentService.getCommentsByItemId(id);
        List<Answer> answers = answerService.getAllAnswers();
        model.addAttribute("answers",answers);
        map.addAttribute("item", item);
        model.addAttribute("comments",comments);
        return "item";
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/items/new-item")
    public String getItemCreate(Authentication authentication) {
        if (authentication!=null)
            return "item_enter";
        else
            return "redirect:/signIn";
    }


    @PreAuthorize("isAuthenticated()")
    @PostMapping("/items/new-item")
    public String getCreateItem(Authentication authentication, ItemDto itemDto, Model model, BindingResult result) {
       try {
        Optional<User> optionalUser = (Optional<User>) authentication.getPrincipal();
        itemService.addItem(itemDto,optionalUser.get());
        List<ItemDto> items = itemService.getAllItems();
        model.addAttribute("items", items);
        return "item_list";
       }
        catch (javax.validation.ConstraintViolationException | NullPointerException | NumberFormatException e) {
            return "item_enter_fail";
        }

    }

    @PreAuthorize("isAuthenticated()")
    @PostMapping("/items/{id}/delete")
    public String deleteItem(@PathVariable("id") Long id,Model model,Authentication authentication) {
       if (authentication!=null) {
           Item item = itemService.getItem(id);
           itemService.deleteItem(item);
           List<ItemDto> items = itemService.getAllItems();
           model.addAttribute("items", items);
           return "item_list";
       }else
           return "redirect:/signIn";
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/items/{id}/update")
    public String getUpdateItemPage(@PathVariable("id") Long id,Model model,Authentication authentication){
        if (authentication != null) {
            model.addAttribute("item",itemService.getItem(id));
            return "car_update";
        }else
            return "redirect:/signIn";
    }

    @PreAuthorize("isAuthenticated()")
    @PostMapping("/items/{id}/update")
    public String updateItem(@PathVariable("id") Long id,Model model,ItemDto itemDto,Authentication authentication){
        Optional<User> optionalUser = (Optional<User>) authentication.getPrincipal();
        itemDto.setId(id);
        itemService.updateItem(itemDto,optionalUser.get());
        List<ItemDto> items = itemService.getAllItems();
        model.addAttribute("items", items);
        return "item_list";
}
}