import java.util.Scanner;

public class CoffeeHouse {
    private static final int MAX_ORDER = 100;
    private String name;
    private String phoneNo;
    private String address;
    private int nLike;
    private Order[] orders;
    private int nOrder;
    // private Coffee Americano = new Coffee("Americano", 4500);
    private Coffee iceAmericano = new Coffee("IceAmericano", 5000);

    public CoffeeHouse(String name, String phoneNo, String addr) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = addr;
        this.orders = new Order[MAX_ORDER];
        this.nOrder = 0;
        this.nLike = 0;
    }

    public int increaseLike() { this.nLike++; return this.nLike; }
    public String getAddress() { return this.address; }
    public String getPhoneNo() { return this.phoneNo; }
    public void addOrder(Order order) {
        if (this.nOrder >= MAX_ORDER) {
            System.out.println("Run out of Coffee...Sorry");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and phoneNumber Please~");
        String name = sc.next();
        String phoneNum = sc.next();
        Customer c = new Customer(name, phoneNum);
        order.takeOrder(c, iceAmericano);
        this.nOrder++;
        if(this.nOrder % 10 == 0) this.nLike++;
    }
}