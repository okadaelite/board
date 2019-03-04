package jp.co.board.controller;

import jp.co.board.config.BoardConfig;
import jp.co.board.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;
    private final BoardConfig boardConfig;

    @GetMapping("/main")
    public String init(Model model) {
        model.addAttribute("boardConfig", boardConfig);
        return "/main";
    }
}
