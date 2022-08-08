package jung.prac.jung_board.board.question.controller;

import jung.prac.jung_board.board.question.entity.Question;
import jung.prac.jung_board.board.question.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/list")
    public String questionList(Model model) {

        List<Question> questionList = questionService.findAll();

        model.addAttribute("questionList", questionList);

        return "/question/list";
    }
}
