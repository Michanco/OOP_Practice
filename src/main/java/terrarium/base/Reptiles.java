package terrarium.base;

public class Reptiles extends Animal{

    @Override
    public String habitat() {
        return "Суша и вода";
    }
    @Override
    public String toString() {
        return String.format("Рептилии, %s", super.toString());
    }
}
