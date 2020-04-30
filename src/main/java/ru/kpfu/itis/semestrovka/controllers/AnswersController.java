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
import ru.kpfu.itis.semestrovka.dto.AnswerDto;
import ru.kpfu.itis.semestrovka.dto.CommentDto;
import ru.kpfu.itis.semestrovka.dto.ItemDto;
import ru.kpfu.itis.semestrovka.models.Answer;
import ru.kpfu.itis.semestrovka.models.Comment;
import ru.kpfu.itis.semestrovka.models.Item;
import ru.kpfu.itis.semestrovka.models.User;
import ru.kpfu.itis.semestrovka.repositories.AnswerRepository;
import ru.kpfu.itis.semestrovka.services.AnswerService;
import ru.kpfu.itis.semestrovka.services.CommentService;
import ru.kpfu.itis.semestrovka.services.ItemService;

import java.util.List;
import java.util.Optional;

@Controller
public class AnswersController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private ItemService itemService;

    @Autowired
    private AnswerService answerService;
//    @GetMapping("/items/{id}")
//    public String getItemsPage(@PathVariable("id") Long id, ModelMap map) {
//        Item item = itemService.getItem(id);
//        map.addAttribute("item", item);
//        return "item";
//    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/items/{id}/comments/{commentId}/new-answer")
    public String getCommentCreate(@PathVariable("id") Long id, @PathVariable("commentId") Long commentId, ModelMap map, Model model,Authentication authentication) {
        if (authentication != null) {
            Comment comment = commentService.getComment(commentId);
            Item item = itemService.getItem(id);
            model.addAttribute("comment",comment);
            model.addAttribute("item",item);
            return "answer_form";
        }else {
            return "redirect:/signIn";
        }
    }


    @PreAuthorize("isAuthenticated()")
    @PostMapping("/items/{id}/comments/{commentId}/new-answer")
    public String getCreateItem(@PathVariable("id") Long id, @PathVariable("commentId") Long commentId, Authentication authentication, AnswerDto answerDto,ModelMap map,Model model) {
        Optional<User> optionalUser = (Optional<User>) authentication.getPrincipal();
        Item item = new Item();
        item.setId(id);
        Comment comment = new Comment();
        comment.setId(commentId);
        answerService.addAnswer(answerDto,optionalUser.get(),comment);
        List<ItemDto> items = itemService.getAllItems();
        model.addAttribute("items", items);
        return "item_list";
    }
}
