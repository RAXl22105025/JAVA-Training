package Exception;

class Calculator {
    public int x = 25;
    public int y = 5;

    public void result() {
        try {
            int res = x / y;
            System.out.println("Result: " + res);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            // System.out.println(ae);
            // System.out.println(ae.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
            // System.out.println(ex);
            // System.out.println(ex.getMessage());
        } finally {
            System.out.println("Always Executed");
        }
    }

    public void show() {
        System.out.println("X: " + x);
    }
}

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        cl.result();
        cl.show();
    }
}