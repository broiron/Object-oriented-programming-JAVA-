import java.time.LocalDateTime;

public class Order {
    private static final int MAX_VISIT = 10;
    private Customer customer;
    private LocalDateTime orderDateTime;
    private Coffee coffee;
    private int quantity;

    Order() { }
    void takeOrder(Customer customer, Coffee coffee) {
        this.customer = customer;
        this.coffee = coffee;
        this.quantity++;
        this.orderDateTime = LocalDateTime.now();
        int v = this.customer.increaseVisit();
        if(v>MAX_VISIT) {
            System.out.printf("%d ordered. So get free coffee!\n", v);
            customer.resetVisit();
        }
    }
    int charge() { return coffee.getPrice(); }
}