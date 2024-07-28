import model.Comment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setText("Demo Comment");
        comment.setAuthor("John Doe");
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService service = context.getBean(CommentService.class);
        service.publishComment(comment);
    }
}
