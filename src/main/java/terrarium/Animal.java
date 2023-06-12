package terrarium;

public abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }

    public abstract String habitat();

    @Override
    public String toString() {
        return String.format("Name: %s inhabit %s", name, habitat());
    }
}
