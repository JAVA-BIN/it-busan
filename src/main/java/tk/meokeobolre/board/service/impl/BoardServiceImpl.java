package tk.meokeobolre.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.meokeobolre.board.entity.Board;
import tk.meokeobolre.board.model.BoardVo;
import tk.meokeobolre.board.repository.BoardRepository;
import tk.meokeobolre.board.service.BoardService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service("BoardServiceImpl")
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardRepository boardRepository;


    @Override
    public List<BoardVo> boardList() { // DB >> front
        List<BoardVo> boardVoList = new ArrayList<>();
        List<Board> boards = boardRepository.findAll();
        for (Board board : boards) {
            BoardVo boardVo = new BoardVo();
            boardVo.setId(board.getId());
            boardVo.setCook(board.getCook());
            boardVo.setCategory(board.getCategory());
            boardVo.setManual(board.getManual());
            boardVo.setUsername(board.getUsername());
            boardVo.setPassword(board.getPassword());
            boardVo.setCalorie(board.getCalorie());
            boardVo.setProtein(board.getProtein());
            boardVo.setFat(board.getFat());
            boardVo.setSalt(board.getSalt());
            boardVo.setCreatedDate(board.getCreatedDate());
            boardVo.setModifiedDate(board.getModifiedDate());
            boardVoList.add(boardVo);
        }
        return boardVoList;
    }

    @Override
    public BoardVo boardDetail(Long boardId) {
        BoardVo boardVo = new BoardVo();
        Optional<Board> optionalBoard = boardRepository.findById(boardId);
        if (optionalBoard.isPresent()) {
            Board board = optionalBoard.get();
            boardVo.setId(board.getId());
            boardVo.setCook(board.getCook());
            boardVo.setCategory(board.getCategory());
            boardVo.setManual(board.getManual());
            boardVo.setUsername(board.getUsername());
            boardVo.setPassword(board.getPassword());
            boardVo.setCalorie(board.getCalorie());
            boardVo.setProtein(board.getProtein());
            boardVo.setFat(board.getFat());
            boardVo.setSalt(board.getSalt());
            boardVo.setCreatedDate(board.getCreatedDate());
            boardVo.setModifiedDate(board.getModifiedDate());
        }
       return boardVo;
    }
    @Override
    public void boardCreate(BoardVo boardVo) { // front >> DB
        Board board = new Board();
        board.setCook(boardVo.getCook());
        board.setCategory(boardVo.getCategory());
        board.setManual(boardVo.getManual());
        board.setUsername(boardVo.getUsername());
        board.setPassword(boardVo.getPassword());
        board.setCalorie(boardVo.getCalorie());
        board.setProtein(boardVo.getProtein());
        board.setFat(boardVo.getFat());
        board.setSalt(boardVo.getSalt());
        board.setCreatedDate(new Date());
        board.setModifiedDate(new Date());
        boardRepository.save(board);
    }
    @Override
    public void boardUpdate(BoardVo boardVo) {
        Board board = new Board();
        board.setCook(boardVo.getCook());
        board.setCategory(boardVo.getCategory());
        board.setManual(boardVo.getManual());
        board.setUsername(boardVo.getUsername());
        board.setPassword(boardVo.getPassword());
        board.setCalorie(boardVo.getCalorie());
        board.setProtein(boardVo.getProtein());
        board.setFat(boardVo.getFat());
        board.setSalt(boardVo.getSalt());
        board.setModifiedDate(new Date());
        boardRepository.save(board);
    }
    @Override
    public void boardDelete(Long boardId) {
        boardRepository.deleteById(boardId);
    }

}
