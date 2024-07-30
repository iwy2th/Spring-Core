package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
public class UserService {
    private final CommentRepository repo;
    @Autowired
    public UserService(CommentRepository repo) {
        this.repo = repo;
    }

    public CommentRepository getRepo() {
        return repo;
    }
}
