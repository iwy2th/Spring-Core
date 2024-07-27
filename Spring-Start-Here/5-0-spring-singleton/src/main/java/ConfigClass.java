import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.CommentService;

@Configuration
@ComponentScan(basePackages = "service")
public class ConfigClass {
    @Bean
    public CommentService commentService() {
        return new CommentService();
    }
    @Bean
    public CommentService commentService2() {
        return new CommentService();
    }
}
