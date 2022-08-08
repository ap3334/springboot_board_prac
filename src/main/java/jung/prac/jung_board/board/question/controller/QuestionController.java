package jung.prac.jung_board.board.question.controller;

import jung.prac.jung_board.board.question.dto.QuestionDto;
import jung.prac.jung_board.board.question.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/list")
    public String questionList(Model model) {

        List<QuestionDto> questionDtoList = questionService.getList();

        model.addAttribute("questionList", questionDtoList);

        return "question/list";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") Long id) {

        QuestionDto questionDto = questionService.getOne(id);

        if (questionDto == null) {
            return "redirect:/question/list";
        }

        model.addAttribute("question", questionDto);

        return "/question/detail";

    }


}
