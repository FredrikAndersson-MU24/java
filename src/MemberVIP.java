public class MemberVIP extends Member {

    public MemberVIP(String name) {
        super(name, true, 28);
    }

    @Override
    public String toString() {
        return  "\nMemberReg" +
                "\nmemberID: " + memberID +
                "\nname: " + name +
                "\nVIP: " + VIP +
                "\nlendPeriod: " + lendPeriod +
                "\nloans: " + loans.toString();
    }
}
