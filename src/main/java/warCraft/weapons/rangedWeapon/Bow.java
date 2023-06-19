package warCraft.weapons.rangedWeapon;

public class Bow implements Ranged{
    @Override
    public int damage() {
        return 15;
    }

    @Override
    public int distance() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Bow. Damage Level: %d Distance: %d ", damage(), distance());
    }
}
