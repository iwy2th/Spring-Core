package org.example.springwebscopes.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class LoginCountService {
    private int loginCount;

    public void incrementLoginCount() {
        loginCount++;
    }

    public int getLoginCount() {
        return loginCount;
    }


}
