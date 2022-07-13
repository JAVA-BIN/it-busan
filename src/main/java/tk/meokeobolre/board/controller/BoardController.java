package tk.meokeobolre.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tk.meokeobolre.board.model.BoardVo;
import tk.meokeobolre.board.service.BoardService;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/list")
    public String boardList(Model model) {
        model.addAttribute("boardList", boardService.boardList());
        return "board/list";
    }

    @GetMapping("/{boardId}")
    public BoardVo boardDetail(@PathVariable Long boardId) {
        return boardService.boardDetail(boardId);
    }

    @PostMapping("/create")
    public String boardCreate(BoardVo boardVo) {
        boardService.boardCreate(boardVo);
        return "redirect:/board/list";
    }

    @PutMapping("/update")
    public void boardUpdate(BoardVo boardVo) {
        boardService.boardUpdate(boardVo);
    }

    @DeleteMapping("/delete")
    public String boardDelete(Long boardId) {
        boardService.boardDelete(boardId);
        return "signin";
    }
}
