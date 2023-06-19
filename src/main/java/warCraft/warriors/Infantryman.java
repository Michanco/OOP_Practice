package warCraft.warriors;

import warCraft.armors.Armor;
import warCraft.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee, Armor>{
    public Infantryman(String name, int healthPoint, Melee weapon, Armor shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Infantry %s ", super.toString());
    }
}
