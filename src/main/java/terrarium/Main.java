package terrarium;

import terrarium.base.Animal;
import terrarium.residents.*;
import terrarium.terrarium.AggressionLevel;
import terrarium.terrarium.NumberOfLegs;
import terrarium.terrarium.SwimSpeed;
import terrarium.terrarium.Terrarium;

public class Main {
    public static void main(String[] args) {
        Animal spider = new Spider("Птицеед");
        Animal mantis = new Mantis("Зелёный");
        Animal turtle = new Turtle("Тортилла");
        Animal snake = new Snake("Кобра");
        Animal lizard = new Lizard("Игуана");

        Terrarium terrarium = new Terrarium();
        terrarium.addNewAnimal(spider).addNewAnimal(mantis).addNewAnimal(turtle).addNewAnimal(snake).addNewAnimal(lizard);
        System.out.println(terrarium);
        System.out.println("Агрессивные жители террариума:\n");
        for (AggressionLevel item: terrarium.aggressors()) {
            System.out.printf("%s Уровень агрессии: %d\n",item,item.getAggression());
        }

        System.out.println("Жители террариума с ногами:\n");
        for (NumberOfLegs item : terrarium.havingLegs()) {
            System.out.printf("%s Количество ног: %d\n", item, item.getNumberOfLegs());
        }

        System.out.println("Быстрее плавает;\n");
        SwimSpeed fast = terrarium.fastSwimmer();
        System.out.printf("%s Скорость: %d\n", fast, fast.getSwimSpeed());
    }
}
