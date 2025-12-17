public class Bank {
    static String bankName = "HDFC";
    static changeBank(String changename){
        this.bankName = changename;
    }

    String name
    int balance;

    Bank(){
        this.name= "Pranav";
        this.balance = 1000;
    }

    void showAccountDetails(){
        System.out.println("The Bank name is " + this.bankName);
        System.out.println("the Account person name:" + this.name);
        System.out.println("the account balance :" + this.balance);
    }

    public static void main(String[] args) {
        Bank obj = new Bank();
        Bank obj2 = new Bank();
        obj.changeBank("SBI");
        obj.showAccountDetails();
        
        obj2.changeBank("Punjab National Bank");
        obj2.showAccountDetails();
    }
}
