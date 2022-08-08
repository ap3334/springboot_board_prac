package jung.prac.jung_board.board.repository;

import jung.prac.jung_board.board.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Question, Long> {
}
