package services;

import aspects.ToLog;
import model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    public void publishComment(Comment comment) {
//        logger.info("Publishing comment " + comment.getText());
        System.out.println("Publishing comment " + comment.getText());
    }

    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Deleting comment " + comment.getText());
//        System.out.println("Deleting comment " + comment.getText());
    }

    public void EditComment(Comment comment) {
//        logger.info("Editing comment " + comment.getText());
        System.out.println("Editing comment " + comment.getText());
    }
}
