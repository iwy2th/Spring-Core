import model.Comment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setText("Demo Comment");
        comment.setAuthor("John Doe");
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService service = context.getBean(CommentService.class);
        var value = service.publishComment(comment);
        logger.info(value);
    }
}
