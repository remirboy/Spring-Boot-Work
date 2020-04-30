package ru.kpfu.itis.semestrovka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.semestrovka.dto.AnswerDto;
import ru.kpfu.itis.semestrovka.models.Answer;
import ru.kpfu.itis.semestrovka.models.Comment;
import ru.kpfu.itis.semestrovka.models.User;
import ru.kpfu.itis.semestrovka.repositories.AnswerRepository;
import ru.kpfu.itis.semestrovka.repositories.CommentRepository;

import java.util.List;

@Component
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public List<Answer> getAllAnswers() {
         return answerRepository.findAll();
    }

    @Override
    public Answer getAnswer(Long id) {
        return answerRepository.findAnswerById(id);
    }

    @Override
    public List<Answer> getAnswersByCommentId(Long comment_id) {
        return answerRepository.findAllByCommentId(comment_id);
    }

    @Override
    public void addAnswer(AnswerDto form, User user, Comment comment) {
        Answer answer = Answer.builder()
                .userId(user.getId())
                .commentId(comment.getId())
                .content(form.getContent())
                .build();
        answerRepository.save(answer);
    }
}
