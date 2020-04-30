package ru.kpfu.itis.semestrovka.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.semestrovka.dto.UserDto;
import ru.kpfu.itis.semestrovka.models.User;
import ru.kpfu.itis.semestrovka.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository usersRepository;


    @Override
    public List<UserDto> getAllUsers() {
        return UserDto.from(usersRepository.findAll());
    }


    @Override
    public void deleteUser(Long userId) {
        usersRepository.deleteById(userId);
    }

    @Override
    public User getUser(Long userId) {
        return usersRepository.findUserById(userId);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return usersRepository.findByEmail(email);
    }
}
