package warCraft.warriors;

import warCraft.armors.Armor;
import warCraft.weapons.Weapon;

import java.util.Random;

public abstract class Warrior <W extends Weapon, A extends Armor>{
    private final String name;
    private int healthPoint;
    private W weapon;
    private A armor;


    public Warrior(String name, int healthPoint, W weapon, A armor) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public int hit(){
        Random rnd = new Random();
        int hitDamage = rnd.nextInt(0,weapon.damage() + 1);

        return hitDamage;
    }

    public void reduceHealth(int damage){
        if (damage > armor.getShield()) healthPoint -= damage - armor.getShield();
        if (healthPoint < 0 ) healthPoint = 0;
    }

    @Override
    public String toString() {
        return String.format("Name %s, HP %d, Weapon %s, Armor %s", name,healthPoint,weapon, armor);
    }
}