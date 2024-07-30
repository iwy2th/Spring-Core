import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var cs1 = context.getBean("commentService", CommentService.class);
        var cs2 = context.getBean("commentService", CommentService.class);
        System.out.println(cs1 == cs2);
    }
}
