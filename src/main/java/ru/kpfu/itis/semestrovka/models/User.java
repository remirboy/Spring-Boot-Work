package ru.kpfu.itis.semestrovka.models;

import com.sun.istack.internal.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import javax.validation.constraints.Pattern;

import lombok.Builder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    @Pattern(regexp = " ^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@\" +\n\"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$")
    @Column(name = "email", unique = true, nullable = false)
    @NotNull
    private String email;

    @NotNull
    private String hashPassword;


    @NotNull
    private String gender;

    @NotNull
    private String country;

    @NotNull
    @Pattern(regexp = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)")
    private String date;

//    @OneToMany (mappedBy="user", fetch=FetchType.LAZY)
//    private Collection<Comment> comments = new ArrayList<Comment>();
//
//    @OneToMany (mappedBy="user",fetch=FetchType.LAZY)
//    private Collection<Answer> answers  = new ArrayList<Answer>();;

}
