package jung.prac.jung_board.board.answer.controller;

import jung.prac.jung_board.board.answer.dto.AnswerDto;
import jung.prac.jung_board.board.answer.service.AnswerService;
import jung.prac.jung_board.board.question.dto.QuestionDto;
import jung.prac.jung_board.board.question.entity.Question;
import jung.prac.jung_board.board.question.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/answer")
@RequiredArgsConstructor
public class AnswerController {

    private final QuestionService questionService;

    private final AnswerService answerService;

    @PostMapping("/create/{id}")
    public String createAnswer(@PathVariable("id") Long id, Model model, @RequestParam("content") String content) {

        QuestionDto questionDto = questionService.getOne(id);
        Question question = questionService.dtoToEntity(questionDto);
        AnswerDto answerDto = AnswerDto.builder().content(content).question(question).createDate(LocalDateTime.now()).build();

        answerService.saveAnswer(answerDto);

        return "redirect:/question/detail/%s".formatted(id) ;
    }

}
