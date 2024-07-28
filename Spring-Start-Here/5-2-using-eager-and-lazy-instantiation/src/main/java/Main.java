import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // Một khía cạnh quan trọng cần quan sát là không ai sử dụng Bean CommentService Spring sẽ tạo và lưu trữ instance trong context
        System.out.println("Before retrieving the CommentService2");
        CommentService commentService = (CommentService) context.getBean("commentService2"); // use casting ^^
        System.out.println("After retrieving the CommentService2");

    }
}
