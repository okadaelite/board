package jp.co.board.controller;

import jp.co.board.config.BoardConfig;
import jp.co.board.service.TopService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TopController {
     private final TopService topService;
     private final BoardConfig boardConfig;

     @GetMapping("/top")
     public String init(Model model) {
         model.addAttribute("boardConfig", boardConfig);
         return "/top";
     }
}
