package terrarium;

public class Insects extends Animal{
    public Insects(String name) {
        super(name);
    }

    @Override
    public String habitat() {
        return "Earth";
    }
}
