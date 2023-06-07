package coffee;

import java.util.*;
import static coffee.Engine.*;


public class Main {
    public static void main(String[] args) {

        Coffee coffee1 = new Coffee("Эспрессо", 40, 95.5, 50);
        Coffee coffee2 = new Coffee("Американо", 120, 95.5, 70);
        Coffee coffee3 = new Coffee("Капучино", 150, 95.5, 90);
        Coffee coffee4 = new Coffee("Латте", 200, 95.5, 100);
        Coffee coffee5 = new Coffee("Какао", 150, 95.5, 70);

        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(coffee1);
        coffeeList.add(coffee2);
        coffeeList.add(coffee3);
        coffeeList.add(coffee4);
        coffeeList.add(coffee5);

        printCoffeNameList(coffeeList);
        System.out.println("Выберите напиток ");
        Scanner scanner = new Scanner(System.in);
        int inputCoffeNameNumber = scanner.nextInt();
        priceOfCoffee(inputCoffeNameNumber -1, coffeeList);
        System.out.println("Введите номиналы до 500, которыми будете расплачиваться , для окончания введите 0 ");
        List<Integer> inputMoneyList = inputMoney();
        int sumOfMoney = 0;
        for (int el:inputMoneyList) {
            sumOfMoney += el;
        }
        if (sumOfMoney > coffeeList.get(inputCoffeNameNumber).price)
            System.out.println("Вы внесли " + sumOfMoney + " руб. Ваша сдача "
                    + (sumOfMoney - coffeeList.get(inputCoffeNameNumber-1).price) + " руб\nEnjoy " + coffeeList.get(inputCoffeNameNumber-1).name);
        else if (sumOfMoney == coffeeList.get(inputCoffeNameNumber-1).price)
            System.out.println("Вы внесли " + sumOfMoney + "\nEnjoy " + coffeeList.get(inputCoffeNameNumber-1).name);
        else System.out.println("Недостаточно средств ");
    }
}
