package warCraft.weapons.meleeWeapon;

public class Sword implements Melee{
    @Override
    public int damage() {
        return 15;
    }
    @Override
    public String toString() {
        return String.format("Sword. Damage Level: %d ", damage());
    }
}
