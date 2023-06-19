package warCraft.weapons.rangedWeapon;

public class CrossBow implements Ranged{
    @Override
    public int damage() {
        return 20;
    }

    @Override
    public int distance() {
        return 60;
    }

    @Override
    public String toString() {
        return String.format("CrossBow. Damage Level: %d Distance: %d ", damage(), distance());
    }
}
