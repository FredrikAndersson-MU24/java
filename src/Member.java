import java.util.ArrayList;
import java.util.UUID;

public abstract class Member {
    protected String memberID;
    protected String name;
    protected boolean VIP;
    protected int lendPeriod;
    protected ArrayList<Loan> loans;

    public Member(String name, boolean VIP, int lendPeriod) {
        this.memberID = String.valueOf(UUID.randomUUID());
        this.name = name;
        this.VIP= VIP;
        this.lendPeriod = lendPeriod;
        this.loans = new ArrayList<>();
    }


    public String toString() {
        return "Member{" +
                "memberID='" + memberID + '\'' +
                ", name='" + name + '\'' +
                ", VIP=" + VIP +
                ", lendPeriod=" + lendPeriod +
                ", loans=" + loans.toString() +
                '}';
    }

    public void lend(Loan loan) {
        loans.add(loan);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }
}
