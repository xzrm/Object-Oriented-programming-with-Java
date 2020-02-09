
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        Account mattsAccount = new Account("Matt's account", 1000);
        
        Account myAccount = new Account("My account", 0);
        
        mattsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        
        System.out.println(mattsAccount);
        System.out.println(myAccount);
    }

}
