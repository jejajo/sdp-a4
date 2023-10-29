import orders.Order;
import orders.BugattiOrder;

public class Main {
    public static void main(String[] args) {
        Order bugattiOrder = new BugattiOrder();
        System.out.println("Order: \n" + bugattiOrder.createOrder() + "\n");
    }
}