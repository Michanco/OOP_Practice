package terrarium.residents;

import terrarium.base.Insects;
import terrarium.terrarium.AggressionLevel;
import terrarium.terrarium.NumberOfLegs;

public class Mantis extends Insects implements AggressionLevel, NumberOfLegs {
    String name;

    public Mantis(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Богомол: %s, Отряд: %s ", name, super.toString());
    }

    @Override
    public int getAggression() {
        return 10;
    }

    @Override
    public int getNumberOfLegs() {
        return 6;
    }
}
