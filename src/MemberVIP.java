public class MemberVIP extends Member {

    public MemberVIP(String name) {
        super(name, true, 4);
    }

    @Override
    public String toString() {
        return  "\nVIP Member" +
                "\nMembership ID: " + memberID +
                "\nName: " + name +
                "\nLend period: " + lendPeriod + " weeks" +
                "\nCurrent loans: " + loans.toString();
    }
}
