package tk.meokeobolre.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.meokeobolre.board.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

    Board findByCook(String cook);

}
