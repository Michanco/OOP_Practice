package warCraft.armors;

public class DiamondShield implements Armor{
    @Override
    public int getShield() {
        return 7;
    }
    @Override
    public String toString() {
        return String.format("DiamondShield - %d", getShield());
    }
}
