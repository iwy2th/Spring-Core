import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        CommentService s1 = context.getBean(CommentService.class);
        var s2 = context.getBean(UserService.class);
        boolean b = s1.getRepo() == s2.getRepo();
        System.out.println(b);
    }
}
