package ru.kpfu.itis.semestrovka.models;

import lombok.*;

import javax.persistence.*;
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
@Table(name = "comments")
public class Comment implements Serializable {

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
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    @NotNull
    private Long itemId;

    @NotNull
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//
//    @ManyToOne (fetch = FetchType.EAGER)
//    @JoinColumn (name="item_id")
//    private Item item;
//
//    @ManyToOne (fetch = FetchType.EAGER)
//    @JoinColumn (name="user_id")
//    private User user;
//
//    @OneToMany (mappedBy="comment", fetch=FetchType.LAZY)
//    private Collection<Answer> answers  = new ArrayList<Answer>();;
}
