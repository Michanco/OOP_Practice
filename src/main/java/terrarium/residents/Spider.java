package terrarium.residents;

import terrarium.base.Insects;
import terrarium.terrarium.AggressionLevel;
import terrarium.terrarium.NumberOfLegs;

public class Spider extends Insects implements AggressionLevel, NumberOfLegs {
    String name;

    public Spider(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format("Паук: %s, Отряд: %s ", name, super.toString());
    }

    @Override
    public int getAggression() {
        return 8;
    }

    @Override
    public int getNumberOfLegs() {
        return 8;
    }
}
