package jung.prac.jung_board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class JungBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(JungBoardApplication.class, args);
    }

}
