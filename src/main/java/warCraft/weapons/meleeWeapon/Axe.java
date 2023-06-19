package warCraft.weapons.meleeWeapon;

public class Axe implements Melee{
    @Override
    public int damage() {
        return 20;
    }
    @Override
    public String toString() {
        return String.format("Axe. Damage Level: %d ", damage());
    }
}
