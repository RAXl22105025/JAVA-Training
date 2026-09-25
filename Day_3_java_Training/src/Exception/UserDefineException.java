package Exception;

class Stock {
    int qoh = 50;

    void issue(int req) throws OutOfStockException {
        if (req > qoh) {
            throw new OutOfStockException("Out of Stock!");
        }

        qoh = qoh - req;
        System.out.println("Stock issued: " + req);
        System.out.println("Remaining stock: " + qoh);
    }
}

public class UserDefineException {
    public static void main(String[] args) {

        Stock s = new Stock();

        try {
            s.issue(75);
        }
        catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }
}