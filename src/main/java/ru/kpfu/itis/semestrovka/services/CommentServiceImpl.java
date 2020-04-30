package ru.kpfu.itis.semestrovka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.semestrovka.dto.CommentDto;
import ru.kpfu.itis.semestrovka.dto.ItemDto;
import ru.kpfu.itis.semestrovka.models.Comment;
import ru.kpfu.itis.semestrovka.models.Item;
import ru.kpfu.itis.semestrovka.models.User;
import ru.kpfu.itis.semestrovka.repositories.CommentRepository;

import java.util.List;

@Component
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<ItemDto> getAllComments() {
        return null;
    }

    @Override
    public Comment getComment(Long id) {
        return commentRepository.findCommentById(id);
    }

    @Override
    public List<Comment> getCommentsByItemId(Long item_id) {
       return commentRepository.findCommentsByItemId(item_id);
    }

    @Override
    public void addComment(CommentDto form, User user, Item item) {
        Comment comment = Comment.builder()
                .userId(user.getId())
                .itemId(item.getId())
                .content(form.getContent())
                .build();
        commentRepository.save(comment);
    }
}
