package ru.kpfu.itis.semestrovka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kpfu.itis.semestrovka.dto.CommentDto;
import ru.kpfu.itis.semestrovka.dto.ItemDto;
import ru.kpfu.itis.semestrovka.models.Comment;
import ru.kpfu.itis.semestrovka.models.Item;
import ru.kpfu.itis.semestrovka.models.User;
import ru.kpfu.itis.semestrovka.services.CommentService;
import ru.kpfu.itis.semestrovka.services.ItemService;

import java.util.List;
import java.util.Optional;

@Controller
public class CommentsController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private ItemService itemService;

//    @GetMapping("/items/{id}")
//    public String getItemsPage(@PathVariable("id") Long id, ModelMap map) {
//        Item item = itemService.getItem(id);
//        map.addAttribute("item", item);
//        return "item";
//    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/items/{id}/new-comment")
    public String getCommentCreate(@PathVariable("id") Long id, ModelMap map,Model model,Authentication authentication) {
        if (authentication!=null) {
            Item item = itemService.getItem(id);
            model.addAttribute("item", item);
            return "comment_form";
        }else {
            return "redirect:/signIn";
        }
    }


    @PreAuthorize("isAuthenticated()")
    @PostMapping("/items/{id}/new-comment")
    public String getCreateItem(@PathVariable("id") Long id,Authentication authentication, CommentDto commentDto) {
        Optional<User> optionalUser = (Optional<User>) authentication.getPrincipal();
        Item item = new Item();
        item.setId(id);
        commentService.addComment(commentDto,optionalUser.get(),item);
        return "start_page";
    }
}
