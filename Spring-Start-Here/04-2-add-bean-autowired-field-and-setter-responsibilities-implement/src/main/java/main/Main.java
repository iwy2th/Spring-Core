package main;

import model.Comment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
//        var commentRepository = new DBCommentRepository();
//        var commentNotificationProxy = new EmailCommentNotificationProxy();
//
//        var commentService = new CommentService(commentRepository, commentNotificationProxy);
//        var comment = new Comment();
//        comment.setAuthor("Jack Bauer x");
//        comment.setText("Hello sir, i want ask you one question");
//        commentService.publishComment(comment);
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService commentService = context.getBean(CommentService.class);
        var comment = new Comment();
        comment.setAuthor("Jack Bauer x");
        comment.setText("Hello sir, i want ask you one question");
        commentService.publishComment(comment);
    }
}
