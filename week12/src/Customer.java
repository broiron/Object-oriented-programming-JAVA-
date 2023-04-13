public class Customer   {
    private String name;
    private String phoneNo;
    private int visit;

    Customer(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.visit = 0;
    }

    public String getName() { return this.name; }
    public String getPhoneNo() { return this.phoneNo; }
    public int increaseVisit() { this.visit++; return visit; }
    public void resetVisit() { this.visit = 0; }
}