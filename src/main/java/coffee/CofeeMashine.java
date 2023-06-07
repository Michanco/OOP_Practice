package coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CofeeMashine {

    private List<Coffee> coffeeList = new ArrayList<>();

    public CofeeMashine addCoffee(Coffee name){
        coffeeList.add(name);
        return this;
    }
    public static void printCoffeNameList ( List<Coffee> inputList){
        System.out.println("Доступны следующие напитки:\n");
        for (int i = 0; i < inputList.size(); i++) {
            System.out.println(i + 1  + " - " + inputList.get(i).toString());
        }
    }

    public static void priceOfCoffee (int inputNum, List<Coffee> inputList) {
        System.out.println("Стоимость напитка - " + inputList.get(inputNum).getPrice() + " руб");
    }

    public static List<Integer> inputMoney(){
        List<Integer> moneyList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
            while (true){
                int temp = scanner.nextInt();
                if (temp == 0) break;
                else if (realMoney(temp)) moneyList.add(temp);
                else System.out.println("номинала " + temp + " не существует");
            }
        return moneyList;
    }

    public static boolean realMoney (int coin){
        int[] realMoneyArray = {1, 2, 5, 10, 50, 100, 500};
        for (int el: realMoneyArray) {
            if (coin == el) {
                return true;
            }
        }
        return false;
    }

    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }
}
