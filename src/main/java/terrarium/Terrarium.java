package terrarium;

import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    private List<Animal> terrarium = new ArrayList<>();

    public Terrarium addNewAnimal(Animal newAnimal){
        terrarium.add(newAnimal);
        return this;
    }
}
