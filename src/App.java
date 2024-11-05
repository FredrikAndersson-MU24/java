import java.util.ArrayList;

public class App {

    ArrayList<Account> accounts = new ArrayList<Account>();

    public void run(){


        initApp();

    }

    public void initApp(){
        Account savingsAccount = new Account(100_000, "Sparkonto 1");
        Account savingsAccount2 = new Account(150_000, "Sparkonto 2");
        accounts.add(savingsAccount);
        accounts.add(savingsAccount2);
        for(Account a : accounts){
            System.out.println(a);
        }

    }


}
