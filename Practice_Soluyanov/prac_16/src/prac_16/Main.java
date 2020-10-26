package prac_16;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Item dish1 = new Dish(1500.30, "jopa", "tasty");
        Item dish2 = new Dish(2050.20, "not jopa", "not tasty");
        Item drink1 = new Drink(50.5, "vodka", "cool");
        Item drink2 = new Drink(100.60, "not vodka", "not cool");

        Order order1 = new RestaurantOrder();
        order1.add(dish1);
        order1.add(drink1);
        System.out.println("order1:");
        System.out.println(Arrays.toString(order1.getSortedArray()));

        Order order2 = new InternetOrder();
        order2.add(dish2);
        order2.add(drink2);
        System.out.println("order2:");
        System.out.println(Arrays.toString(order2.getSortedArray()));

        InternetOrder order3 = new InternetOrder();
        order3.add("Muhosransk", order2);
        order3.add("Muhosransk", drink1);
        System.out.println("order3:");
        order3.getOrders();

        System.out.println(Arrays.toString(order1.getArrayOfNames()));

        order1.add(dish2);
        System.out.println("add item to order1:");
        System.out.println(Arrays.toString(order1.getArrayOfNames()));
        System.out.println("Num of orders in order1: " + order1.numOfOrders());
        System.out.println("Total sum in order1: " + order1.getSumPrice());
        order1.delete("jopa");
        System.out.println(Arrays.toString(order1.getArrayOfNames()));
        order1.add(drink1);
        order1.add(drink1);

        System.out.println(Arrays.toString(order1.getArrayOfNames()));
        System.out.println("deleted: " + order1.deleteAll("vodka"));
        System.out.println(Arrays.toString(order1.getArrayOfNames()));
    }
}
