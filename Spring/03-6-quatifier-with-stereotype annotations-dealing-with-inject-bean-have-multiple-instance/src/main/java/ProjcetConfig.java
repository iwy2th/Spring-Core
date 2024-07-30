import beans.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjcetConfig {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean("parrot2")
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

//    @Bean
//    public Person person(@Qualifier("parrot2") Parrot parrot) {
//        Person person = new Person();
//        person.setName("John");
//        person.setParrot(parrot);
//        return person;
//    }
}
