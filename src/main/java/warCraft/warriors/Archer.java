package warCraft.warriors;

import warCraft.armors.Armor;
import warCraft.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged, Armor>{
    public Archer(String name, int healthPoint, Ranged weapon, Armor shield) {
        super(name, healthPoint, weapon, shield);
    }
    public int distance(){
        return super.getWeapon().distance();
    }

    @Override
    public String toString() {
        return String.format("Archer %s ", super.toString());
    }
}
