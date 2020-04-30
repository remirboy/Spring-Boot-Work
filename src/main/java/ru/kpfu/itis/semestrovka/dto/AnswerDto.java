package ru.kpfu.itis.semestrovka.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.itis.semestrovka.models.Answer;
import ru.kpfu.itis.semestrovka.models.Comment;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AnswerDto {
    private Long id;
    private Long userId;
    private Long commentId;
    private String content;

    public static AnswerDto from(Answer answer) {
        return AnswerDto.builder()
                .id(answer.getId())
                .userId(answer.getUserId())
                .commentId(answer.getCommentId())
                .content(answer.getContent())
                .build();
    }

    public static List<AnswerDto> from(List<Answer> answers) {
        return answers.stream()
                .map(AnswerDto::from)
                .collect(Collectors.toList());
    }
}
