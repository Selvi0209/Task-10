public class Main {
    public static void main(String[] args) {
        
		Account objAccount = new Account(100.0);

        System.out.println("Initial balance: Rs." + objAccount.getBalance());

        objAccount.withdraw(50.0);
        objAccount.deposit(25.0);

        System.out.println("Final balance: Rs." + objAccount.getBalance());
      
    }
}