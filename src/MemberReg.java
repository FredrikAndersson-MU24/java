import java.util.ArrayList;

public class MemberReg extends Member{

    public MemberReg(String name) {
        super(name, false, 14);
    }

    @Override
    public String toString() {
        return  "\nMemberReg" +
                "\nmemberID: " + memberID +
                "\nname: " + name +
                "\nVIP: " + VIP +
                "\nlendPeriod: " + lendPeriod +
                "\nloans: " + loans;
    }
}
