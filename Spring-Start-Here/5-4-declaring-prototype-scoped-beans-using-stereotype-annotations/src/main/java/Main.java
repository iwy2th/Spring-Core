import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService s1 = context.getBean(CommentService.class);
        UserService s2 = context.getBean(UserService.class);
        System.out.println(s1.getCommentRepository() == s2.getCommentRepository());

    }
}
