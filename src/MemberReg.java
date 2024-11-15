import java.time.Period;

public class MemberReg extends Member{
        private Period period = Period.ofWeeks(2);
    public MemberReg(String name) {
        super(name, false, 2);

    }

    @Override
    public String toString() {
        return  "\nMember" +
                "\nMembership ID: " + memberID +
                "\nName: " + name +
                "\nLend period: " + lendPeriod + " weeks" +
                "\nCurrent loans: " + loans.toString();
    }



}
