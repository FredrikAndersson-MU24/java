package members;

public class MemberReg extends Member{
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
