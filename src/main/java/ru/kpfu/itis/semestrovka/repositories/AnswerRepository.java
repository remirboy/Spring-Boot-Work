package ru.kpfu.itis.semestrovka.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.semestrovka.models.Answer;
import ru.kpfu.itis.semestrovka.models.Comment;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    Answer findAnswerById(Long id);
    List<Answer> findAnswersByCommentId(Long comment_id);
    List<Answer> findAllByCommentId(Long id);
}
