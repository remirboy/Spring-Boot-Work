package ru.kpfu.itis.semestrovka.services;

import ru.kpfu.itis.semestrovka.dto.CommentDto;
import ru.kpfu.itis.semestrovka.dto.ItemDto;
import ru.kpfu.itis.semestrovka.models.Comment;
import ru.kpfu.itis.semestrovka.models.Item;
import ru.kpfu.itis.semestrovka.models.User;

import java.util.List;

public interface CommentService {
    List<ItemDto> getAllComments();
    Comment getComment(Long id);
    List<Comment> getCommentsByItemId(Long item_id);
    void addComment(CommentDto form, User user, Item item);
}
