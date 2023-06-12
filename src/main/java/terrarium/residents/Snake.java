package terrarium.residents;

import terrarium.base.Reptiles;
import terrarium.terrarium.AggressionLevel;

public class Snake extends Reptiles implements AggressionLevel {
    String name;
    public Snake(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return String.format("Змея: %s, Отряд: %s ", name, super.toString());
    }

    @Override
    public int getAggression() {
        return 5;
    }
}
