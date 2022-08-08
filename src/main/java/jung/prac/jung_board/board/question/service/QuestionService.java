package jung.prac.jung_board.board.question.service;

import jung.prac.jung_board.board.question.dto.QuestionDto;
import jung.prac.jung_board.board.question.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {

    List<QuestionDto> getList();
    QuestionDto getOne(Long id);


    default Question dtoToEntity(QuestionDto dto) {

        Question entity = new Question();

        entity.setId(dto.getId());
        entity.setSubject(dto.getSubject());
        entity.setContent(dto.getContent());
        entity.setCreateDate(dto.getCreateDate());
        entity.setAnswerList(dto.getAnswerList());

        return entity;
    }

    default QuestionDto entityToDto(Question entity) {

        QuestionDto dto = QuestionDto.builder()
                .id(entity.getId())
                .subject(entity.getSubject())
                .content(entity.getContent())
                .createDate(entity.getCreateDate())
                .answerList(entity.getAnswerList())
                .build();

        return dto;
    }

}
