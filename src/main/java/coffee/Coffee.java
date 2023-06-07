package coffee;

public class Coffee {
    String name;
    int size;
    double temperature;
    int price;

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
}
