package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService cmS = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setComment("This is a comment");
        comment.setAuthor("John Doe");
        cmS.publishComment(comment);
        cmS.deleteComment(comment);
        cmS.EditComment(comment);
    }
}
