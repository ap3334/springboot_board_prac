package jung.prac.jung_board.board.question.service;

import jung.prac.jung_board.board.question.entity.Question;
import jung.prac.jung_board.board.question.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService{

    private final QuestionRepository questionRepository;


    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }
}
