package jung.prac.jung_board.board.question.dto;

import jung.prac.jung_board.board.answer.dto.AnswerDto;
import jung.prac.jung_board.board.answer.entity.Answer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionDto {

    private Long id;

    private String subject;

    private String content;

    private List<Answer> answerList;

    private LocalDateTime createDate;

}
