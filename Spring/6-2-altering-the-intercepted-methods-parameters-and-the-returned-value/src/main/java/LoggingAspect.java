import model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Around("execution(* services.*.*(..))")

    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        // get methodName
        String methodName = joinPoint.getSignature().getName();
        // get arguments
        Object[] args = joinPoint.getArgs();
        logger.info("Method " + methodName + " with parameters " + Arrays.asList(args) +
                " will execute");
        // change value
        Comment comment = new Comment();
        comment.setText("Your text has been changed !!! surprise OoO");
        Object[] newArgs = {comment};
        // get return value
        Object returnedByMethod = joinPoint.proceed(newArgs);
        logger.info("Method executed and returned " + returnedByMethod);
        // change return value
        return "FAILED";
    }
}
