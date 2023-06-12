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

    public  List<NumberOfLegs> havingLegs(){
        List<NumberOfLegs> havingLegs = new ArrayList<>();
        for (Animal item: terrarium) {
            if(item instanceof NumberOfLegs) havingLegs.add((NumberOfLegs) item);
        }
        return havingLegs;
    }

    public List<SwimSpeed> swimmers(){
        List<SwimSpeed> swimmers = new ArrayList<>();
        for (Animal item: terrarium) {
            if(item instanceof SwimSpeed) swimmers.add((SwimSpeed) item);
        }
        return swimmers;
    }

    public SwimSpeed fastSwimmer(){
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed fast = swimmers.get(0);
        for (SwimSpeed item: swimmers) {
            if (item.getSwimSpeed() > fast.getSwimSpeed()) fast = item;
        }
        return fast;
    }



}
