public class Account {
    private double balance;
    private String name;

    public Account(double newBalance){
        this.balance = newBalance;
    }

    public Account (){
        this.balance = 0;
    }

    public Account(double newBalance, String newName){
        this.name = newName;
        this.balance = newBalance;
    }

    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String toString(){
        return "Account name: " + this.name + "\nBalance: " + this.balance;
    }

}


// övning 2.
//Skapa en Account klass som representerar ett bankkonto.Account klassen ska
//
//*ha en balance där kontots saldo sparas
//*Två konstruktörer. en som sätter balance till 0 och en som tar in en balance.
//*en metod withdraw som minskar saldot
//*en metod deposit som ökar saldot
//*en instansvariabel name av typen String
//*två metoder getName och setName som läser respektive skriver till name
//*en ny konstruktor som sätter både name och balance
//*en metod toString som returnerar en sträng innehållandes en mening med name och balance på lämplig form.
//Ändra i ditt program så att du testar de nya metoderna. För att testa toString räcker det att du anropar System.out.println(savingsAccount);