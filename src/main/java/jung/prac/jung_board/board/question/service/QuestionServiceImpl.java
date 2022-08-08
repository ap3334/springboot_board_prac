package jung.prac.jung_board.board.question.service;

import jung.prac.jung_board.board.question.dto.QuestionDto;
import jung.prac.jung_board.board.question.entity.Question;
import jung.prac.jung_board.board.question.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService{

    private final QuestionRepository questionRepository;


    @Override
    public List<QuestionDto> getList() {

        List<QuestionDto> questionDtoList= questionRepository.findAll().stream().map(i -> {
            return entityToDto(i);
        }).collect(Collectors.toList());

        return questionDtoList;
    }

    @Override
    public QuestionDto getOne(Long id) {

        Optional<Question> question = questionRepository.findById(id);

        if (question.isPresent()) {
            return entityToDto(question.get());
        }

        return null;
    }
}
