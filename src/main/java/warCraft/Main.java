package warCraft;

import warCraft.armors.Armor;
import warCraft.armors.DiamondShield;
import warCraft.armors.GoldShield;
import warCraft.warriors.Archer;
import warCraft.warriors.Infantryman;
import warCraft.warriors.Warrior;
import warCraft.weapons.meleeWeapon.Axe;
import warCraft.weapons.meleeWeapon.Melee;
import warCraft.weapons.meleeWeapon.Sword;
import warCraft.weapons.rangedWeapon.Bow;
import warCraft.weapons.rangedWeapon.CrossBow;
import warCraft.weapons.rangedWeapon.Ranged;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Petya", 100, new Bow(), new GoldShield()));
        team1.add(new Infantryman("Vasya", 100, new Axe(), new DiamondShield()));

        Team<Archer> team2 = new Team<>();
        team2.add(new Archer("Bob", 80, new CrossBow(), new DiamondShield()));
        team2.add(new Archer("Serge", 80, new Bow(), new GoldShield()));

//        System.out.println(team1);
//        System.out.println(team2);


        Battle<Melee, Armor, Melee,Armor> battle = new Battle<>(new Infantryman("Vova", 120, new Axe(), new DiamondShield())
                ,new Infantryman("Serge", 80, new Sword(), new GoldShield()));
        battle.fight();
    }
}
