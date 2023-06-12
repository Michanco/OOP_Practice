package terrarium;

import terrarium.base.Animal;
import terrarium.residents.Mantis;
import terrarium.residents.Snake;
import terrarium.residents.Spider;
import terrarium.residents.Turtle;
import terrarium.terrarium.AggressionLevel;
import terrarium.terrarium.Terrarium;

public class Main {
    public static void main(String[] args) {
        Animal spider = new Spider("Птицеед");
        Animal spider2 = new Spider("Тарантул");
        Animal mantis = new Mantis("Зелёный");
        Animal mantis2 = new Mantis("Оранжевый");
        Animal turtle = new Turtle("Тортилла");
        Animal snake = new Snake("Кобра");
        Animal snake2 = new Snake("Уж");

        Terrarium terrarium = new Terrarium();
        terrarium.addNewAnimal(spider).addNewAnimal(spider2).addNewAnimal(mantis).addNewAnimal(mantis2)
                .addNewAnimal(turtle).addNewAnimal(snake).addNewAnimal(snake2);
        //System.out.println(terrarium);
        System.out.println("Агрессивные жители террариума:\n");
        for (AggressionLevel item: terrarium.aggressors()) {
            System.out.printf("%s Уровень агрессии: %d\n",item,item.getAggression());
        }
    }
}
