package jung.prac.jung_board.board.answer.service;

import jung.prac.jung_board.board.answer.dto.AnswerDto;
import jung.prac.jung_board.board.answer.entity.Answer;
import org.springframework.stereotype.Service;

@Service
public interface AnswerService {

    void saveAnswer(AnswerDto answerDto);

    default Answer dtoToEntity(AnswerDto dto) {

        Answer entity = new Answer();

        entity.setId(dto.getId());
        entity.setContent(dto.getContent());
        entity.setQuestion(dto.getQuestion());
        entity.setCreateDate(dto.getCreateDate());

        return entity;

    }

    default AnswerDto entityToDto(Answer entity) {

        AnswerDto dto = AnswerDto.builder()
                .id(entity.getId())
                .content(entity.getContent())
                .question(entity.getQuestion())
                .createDate(entity.getCreateDate())
                .build();

        return dto;

    }

}
