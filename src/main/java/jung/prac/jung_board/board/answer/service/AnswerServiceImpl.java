package jung.prac.jung_board.board.answer.service;

import jung.prac.jung_board.board.answer.dto.AnswerDto;
import jung.prac.jung_board.board.answer.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnswerServiceImpl implements AnswerService{

    private final AnswerRepository answerRepository;

    @Override
    public void saveAnswer(AnswerDto answerDto) {

        answerRepository.save(dtoToEntity(answerDto));

    }
}
