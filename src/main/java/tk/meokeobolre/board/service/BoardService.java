package tk.meokeobolre.board.service;

import org.springframework.stereotype.Service;
import tk.meokeobolre.board.model.BoardVo;

import java.util.List;

@Service
public interface BoardService {

    List<BoardVo> boardList();
    BoardVo boardDetail(Long boardId);
    void boardCreate(BoardVo boardVo);
    void boardUpdate(BoardVo boardVo);
    void boardDelete(Long boardId);
}
