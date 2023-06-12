package terrarium.residents;

import terrarium.base.Reptiles;
import terrarium.terrarium.AggressionLevel;
import terrarium.terrarium.SwimSpeed;

public class Snake extends Reptiles implements AggressionLevel, SwimSpeed {
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

    @Override
    public int getSwimSpeed() {
        return 15;
    }
}
