import beans.Parrot;
import beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjcetConfig.class);
        Parrot parrot = context.getBean("parrot",Parrot.class);
        Person person = context.getBean("person",Person.class);
        System.out.println("Parrot's name: "+ parrot.getName());
        System.out.println("Person's name: "+ person.getName());
        System.out.println("Person's parrot: "+ person.getParrot());
    }
}
