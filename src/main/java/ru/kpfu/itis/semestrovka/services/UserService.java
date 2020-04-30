package ru.kpfu.itis.semestrovka.services;

import ru.kpfu.itis.semestrovka.dto.UserDto;
import ru.kpfu.itis.semestrovka.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
        List<UserDto> getAllUsers();
        void deleteUser(Long userId);
        User getUser(Long userId);
        Optional<User> getUserByEmail(String email);
}


