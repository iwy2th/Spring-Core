import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import repositories.CommentRepository;
import services.CommentService;

@Configuration
@ComponentScan(basePackages = {"services", "repositories"})
public class ConfigClass {
    @Bean
    @Autowired
    public CommentService commentService(CommentRepository commentRepository) {
        return new CommentService(commentRepository);
    }
}
