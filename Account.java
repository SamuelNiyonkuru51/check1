public class Account {
    private int accNumber;
    private String Fullname;

    private String accType;
    private String balance;
    private String interest;


    public Account(int accNumber, String Fullname, String accType, String balance, String interest) {
        this.accNumber = accNumber;
        this.Fullname = Fullname;
        this.accType = accType;
        this.balance = balance;
        this.interest = interest;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getFullname() {
        return Fullname;
    }

    public String getaccType() {
        return accType;
    }
    public String getBalance() {
        return balance;
    }
    public String getInterest() {
        return interest;
    }

    public String toString() {
        return accNumber +"\t"+ Fullname+"\t"+accType+"\t"+balance+"\t"+interest;
    }
}