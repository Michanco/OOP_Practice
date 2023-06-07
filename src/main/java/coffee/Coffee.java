package coffee;

public class Coffee {
    private String name;
    private int size;
    private double temperature;
    private int price;

    public Coffee(String name, int size, double temperature, int price){
        this.name = name;
        this.size = size;
        this.temperature = temperature;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name).append("/").append(size).append(" мл/")
                .append(temperature).append("C/").append(price).append(" руб");
        return builder.toString();
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
