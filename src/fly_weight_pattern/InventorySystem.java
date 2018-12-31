package fly_weight_pattern;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
    private final Catalog catalog = new Catalog();
    public final List<Order> orders = new CopyOnWriteArrayList<>();

    void takeOrder(String itemName, int orderNumber) {
        Item item = catalog.lookup(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    void process() {
        for (Order order :
                orders) {
            order.processOrder();
            orders.remove(order);
        }
    }

    String report() {
        return " Total : " + catalog.totalItemsMade();
    }
}
