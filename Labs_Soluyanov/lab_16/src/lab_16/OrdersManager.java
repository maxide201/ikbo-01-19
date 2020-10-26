package lab_16;

public interface OrdersManager {
    int itemsQuantity(String itemName);

    int itemsQuantity(MenuItem item);

    Orderable[] getOrders();

    int ordersCostSummary();

    int ordersQuantity();
}