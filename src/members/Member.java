package members;

import medias.Loan;

import java.util.ArrayList;
import java.util.Random;
//import java.util.UUID;

public abstract class Member {
    protected int memberID;
    protected String name;
    protected boolean VIP;
    protected int lendPeriod;
    protected ArrayList<Loan> loans;
    private ArrayList<Integer> ID = new ArrayList<>();

    public Member(String name, boolean VIP, int lendPeriod) {
        this.memberID = generateID() ;  //String.valueOf(UUID.randomUUID());
        this.name = name;
        this.VIP= VIP;
        this.lendPeriod = lendPeriod;
        this.loans = new ArrayList<>();
    }

    public String toStringAdmin() {
        return "Member" +
                "Member ID: " + memberID +
                ", Name: " + name +
                ", VIP: " + VIP +
                ", Lend Period: " + lendPeriod +
                ", Loans: " + loans.toString() /*+
                ", Late returns: " + isLate() TODO isLate method*/;
    }

    public String getName() {
        return name;
    }

    public int getLendPeriod() {
        return lendPeriod;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public Loan getLoan(String title) {
        Loan loan = null;
        for (Loan l : loans) {
            if (l.getTitle().equals(title)) {
                loan = l;
            }
        }
        return loan;
    }

    public boolean hasItem(String title) {
        for (Loan l : loans) {
            if (l.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public int generateID(){
        while(true){
            Random rand = new Random();
            int randomID = rand.nextInt(10000);
            if (!ID.contains(randomID)) {
                return randomID;
            }
        }
    }

}
