package main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

@Configuration
@ComponentScan(basePackages = "proxies")
public class ProjectConfig {
    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }
    @Bean
    @Qualifier("EMAIL")
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }
    @Bean
    public CommentService commentService(
            CommentRepository commentRepository,
            @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository, commentNotificationProxy);
    }
}
