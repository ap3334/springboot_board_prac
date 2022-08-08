package jung.prac.jung_board.board.answer.dto;

import jung.prac.jung_board.board.question.dto.QuestionDto;
import jung.prac.jung_board.board.question.entity.Question;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnswerDto {

    private Long id;

    private Question question;

    private String content;

    private LocalDateTime createDate;

}
