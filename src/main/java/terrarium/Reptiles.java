package terrarium;

public class Reptiles extends Animal{

    public Reptiles(String name) {
        super(name);
    }

    @Override
    public String habitat() {
        return "Earth + water";
    }
}
