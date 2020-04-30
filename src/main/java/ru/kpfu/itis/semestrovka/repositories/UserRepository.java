package ru.kpfu.itis.semestrovka.repositories;

import org.hibernate.hql.internal.ast.SqlASTFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.semestrovka.models.User;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserById(Long id);
    Optional<User> findByEmail(String email);

}
