package Exception;




public class CustomerException {
    public static void main(String[] args) {

        Account a = new Account();

        try {
            a.checkAccount("101");   // change to 100 to test valid account
        }
        catch (AccountNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
