package terrarium.residents;

import terrarium.base.Reptiles;
import terrarium.terrarium.NumberOfLegs;
import terrarium.terrarium.SwimSpeed;

public class Turtle extends Reptiles implements NumberOfLegs, SwimSpeed {
    String name;
    public Turtle(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return String.format("Черепаха: %s, Отряд: %s ", name, super.toString());
    }

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }
}
