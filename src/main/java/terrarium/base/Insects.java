package terrarium.base;

public class Insects extends Animal{


    @Override
    public String habitat() {
        return "Суша";
    }

    @Override
    public String toString() {
        return String.format("Насекомые, %s", super.toString());
    }
}
