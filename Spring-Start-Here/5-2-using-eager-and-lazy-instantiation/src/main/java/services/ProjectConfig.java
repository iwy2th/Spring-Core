package services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
//@ComponentScan(basePackages = "services")
public class ProjectConfig {
    @Bean
    public CommentService commentService() {
        return new CommentService();
    }
    // The @Lazy annotation tells Spring that it
    // needs to create the bean only when someone
    // refers to the bean for the first time
    @Lazy
    @Bean
    public CommentService commentService2() {
        return new CommentService();
    }
}
