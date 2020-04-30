package ru.kpfu.itis.semestrovka.models;

import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
@Table(name = "items")
public class Item implements Serializable {

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

    @NotNull
    private Long user_id;

    @NotNull
    private String content;

    @NotNull
    private String car_name;

    @NotNull
    private Integer power;

    @NotNull
    private Integer max_speed;

    @NotNull
    private  Integer weight;

    @NotNull
    private  Integer waste;

    @NotNull
    private  Integer acceleration;

    private String country;

    private String body;




}
