package warCraft;

import warCraft.armors.Armor;
import warCraft.warriors.Warrior;
import warCraft.weapons.Weapon;

public class Battle<W1 extends Weapon, A1 extends Armor, W2 extends Weapon, A2 extends Armor> {
    private final Warrior<W1,A1> w1Warrior;
    private final Warrior<W2,A2> w2Warrior;

    public Battle(Warrior<W1,A1> w1, Warrior<W2,A2> w2) {
        this.w1Warrior = w1;
        this.w2Warrior = w2;
    }

    public void fight(){
        while (w1Warrior.getHealthPoint() > 0 && w2Warrior.getHealthPoint() > 0){
            int w1Damage = w1Warrior.hit();
            System.out.printf("W1 damage W2 %d HP \n", w1Damage);
            w2Warrior.reduceHealth(w1Damage);
            System.out.printf("W2 HP - %d \n", w2Warrior.getHealthPoint());
            if (w2Warrior.getHealthPoint() <= 0) break;
            int w2Damage = w2Warrior.hit();
            System.out.printf("W2 damage W1 %d HP \n", w2Damage);
            w1Warrior.reduceHealth(w2Damage);
            System.out.printf("W1 HP - %d \n", w1Warrior.getHealthPoint());
        }
        Warrior win = w1Warrior.getHealthPoint() > w2Warrior.getHealthPoint() ? w1Warrior : w2Warrior;
        System.out.printf(" WIN - %s", win.toString());

    }
}
