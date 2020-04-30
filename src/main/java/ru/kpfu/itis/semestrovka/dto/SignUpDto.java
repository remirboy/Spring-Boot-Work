package ru.kpfu.itis.semestrovka.dto;


import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;

@Data
@Getter
@Setter
@Builder
public class SignUpDto {
    private String email;
    private String password;
    private String gender;
    private String country;
    private String date;

    public SignUpDto(String email, String password, String gender, String country, String date) {
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.country = country;
        this.date = date;
    }
}
