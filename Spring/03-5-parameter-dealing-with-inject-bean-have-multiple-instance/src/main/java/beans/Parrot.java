package beans;

public class Parrot {

    private String name ;

    public Parrot() {
        System.out.println("call");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
