public class Library {

    public void run(){

        Member mem = new MemberReg("Fred");

        System.out.println(mem);

        mem.lend(new Loan("det här är titeln"));

        System.out.println(mem);

        for(Loan l : mem.loans){
            System.out.println(l.toString());
        }
    }

}
