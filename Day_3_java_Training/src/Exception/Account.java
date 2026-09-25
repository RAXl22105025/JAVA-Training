package Exception;

class Account {
    String accno = "100";

    void checkAccount(String acc) throws AccountNotFoundException {
        if (!acc.equals(accno)) {
            throw new AccountNotFoundException("Account Number Does Not Exist");
        } else {
            System.out.println("Account Number Exists");
        }
    }
}
