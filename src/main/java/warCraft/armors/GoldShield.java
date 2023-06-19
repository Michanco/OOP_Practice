package warCraft.armors;

public class GoldShield implements Armor{
    @Override
    public int getShield() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("GoldShield - %d", getShield());
    }
}
