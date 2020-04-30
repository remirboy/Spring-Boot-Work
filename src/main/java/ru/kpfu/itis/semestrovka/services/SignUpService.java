package ru.kpfu.itis.semestrovka.services;

import ru.kpfu.itis.semestrovka.dto.SignUpDto;
import ru.kpfu.itis.semestrovka.models.User;

public interface SignUpService {
    User signUp(SignUpDto form);
}
