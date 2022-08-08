package jung.prac.jung_board.board.answer.repository;

import jung.prac.jung_board.board.answer.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
