package jung.prac.jung_board.board.question.service;

import jung.prac.jung_board.board.question.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {

    List<Question> findAll();
}
