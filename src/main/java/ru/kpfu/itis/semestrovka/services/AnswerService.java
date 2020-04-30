package ru.kpfu.itis.semestrovka.services;

import ru.kpfu.itis.semestrovka.dto.AnswerDto;
import ru.kpfu.itis.semestrovka.dto.CommentDto;
import ru.kpfu.itis.semestrovka.dto.ItemDto;
import ru.kpfu.itis.semestrovka.models.Answer;
import ru.kpfu.itis.semestrovka.models.Comment;
import ru.kpfu.itis.semestrovka.models.Item;
import ru.kpfu.itis.semestrovka.models.User;

import java.util.List;

public interface AnswerService {
    List<Answer> getAllAnswers();
    Answer getAnswer(Long id);
    List<Answer> getAnswersByCommentId(Long comment_id);
    void addAnswer(AnswerDto form, User user, Comment comment);

}
