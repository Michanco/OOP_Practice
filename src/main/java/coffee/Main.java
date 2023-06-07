package coffee;

import java.util.*;
import static coffee.CofeeMashine.*;


public class Main {
    public static void main(String[] args) {

        CofeeMashine apparat = new CofeeMashine();
        apparat.addCoffee(new Coffee("Эспрессо", 40, 95.5, 50))
                .addCoffee(new Coffee("Американо", 120, 95.5, 70))
                .addCoffee(new Coffee("Капучино", 150, 95.5, 90))
                .addCoffee(new Coffee("Латте", 200, 95.5, 100))
                .addCoffee(new Coffee("Какао", 150, 95.5, 70));


        printCoffeNameList(apparat.getCoffeeList());
        System.out.println("Выберите напиток ");
        Scanner scanner = new Scanner(System.in);
        int inputCoffeNameNumber = scanner.nextInt();
        priceOfCoffee(inputCoffeNameNumber -1, apparat.getCoffeeList());
        System.out.println("Введите номиналы до 500, которыми будете расплачиваться , для окончания введите 0 ");
        List<Integer> inputMoneyList = inputMoney();
        int sumOfMoney = 0;
        for (int el:inputMoneyList) {
            sumOfMoney += el;
        }
        if (sumOfMoney > apparat.getCoffeeList().get(inputCoffeNameNumber).getPrice())
            System.out.println("Вы внесли " + sumOfMoney + " руб. Ваша сдача "
                    + (sumOfMoney - apparat.getCoffeeList().get(inputCoffeNameNumber-1).getPrice())
                    + " руб\nEnjoy " + apparat.getCoffeeList().get(inputCoffeNameNumber-1).getName());
        else if (sumOfMoney == apparat.getCoffeeList().get(inputCoffeNameNumber-1).getPrice())
            System.out.println("Вы внесли " + sumOfMoney + "\nEnjoy " + apparat.getCoffeeList().get(inputCoffeNameNumber-1).getName());
        else System.out.println("Недостаточно средств ");
    }
}
