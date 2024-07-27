package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Value("John")
    private String name;
    private Parrot parrot;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Parrot getParrot() {
        return parrot;
    }
    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
