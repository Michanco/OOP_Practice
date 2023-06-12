package terrarium.base;

public abstract class Animal {

    public abstract String habitat();

    @Override
    public String toString() {
        return String.format("Среда обитания: %s", habitat());
    }
}
