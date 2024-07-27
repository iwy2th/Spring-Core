import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        CommentService cs1 = context.getBean("commentService",CommentService.class);
        CommentService cs2 = context.getBean("commentService2",CommentService.class);
        System.out.println(cs1 == cs2);
    }
}
