package services;

import repositories.CommentRepository;

public class CommentService {
    private final CommentRepository repo;
    public void printComment() {
        System.out.println("This is a comment Service");
    }

    public CommentService(CommentRepository repo) {
        this.repo = repo;
    }
    public CommentRepository getRepo() {
        return repo;
    }
}
