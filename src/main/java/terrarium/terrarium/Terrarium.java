package terrarium.terrarium;

import terrarium.base.Animal;

import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    private List<Animal> terrarium = new ArrayList<>();

    public Terrarium addNewAnimal(Animal newAnimal){
        terrarium.add(newAnimal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Сегодня в нашем террариуме:\n");
        for (Animal item : terrarium) {
            builder.append(item).append("\n");
        }
        return builder.toString();
    }

    public List<AggressionLevel> aggressors(){
        List<AggressionLevel> aggressors = new ArrayList<>();
        for (Animal item: terrarium) {
            if( item instanceof AggressionLevel) aggressors.add((AggressionLevel)item);
        }
        return aggressors;
    }

}
