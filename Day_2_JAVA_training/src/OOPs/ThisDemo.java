package OOPs;

class Product {
    public String pid;
    public String pname;
    public int pqty;
    public double price;
    public String sdt;

    // Constructor
    public Product(String pid, String pname, int pqty, double price, String sdt) {
        this.pid = pid;
        this.pname = pname;
        this.pqty = pqty;
        this.price = price;
        this.sdt = sdt;
    }

    // Methods belong outside the constructor, inside the class
    public void salesOrder() {
        this.display();
        System.out.println("PID: " + this.pid);
        System.out.println("PNAME: " + this.pname);
        System.out.println("QUANTITY: " + this.pqty);
        System.out.println("PRICE: " + this.price);
        System.out.println("TOTAL PRICE: " + (this.price * this.pqty));
        System.out.println("SALES DATE: " + this.sdt);
    }

    public void display() {
        System.out.println("SALES ORDER FROM XYZ LTD ");
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Product pd = new Product("p1", "TV", 5, 20000, "23-09-2026");
        pd.salesOrder();
    }
}