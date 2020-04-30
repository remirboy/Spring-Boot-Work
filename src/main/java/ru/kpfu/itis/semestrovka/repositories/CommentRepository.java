package ru.kpfu.itis.semestrovka.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.semestrovka.models.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    Comment findCommentById(Long id);
    List<Comment> findCommentsByItemId(Long item_id);
}
