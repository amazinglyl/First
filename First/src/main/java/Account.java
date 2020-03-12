public class Account implements Description {
    int accountNumber;
    public Account(int accountNumber_){
        accountNumber=accountNumber_;
    }
    public void printDescription(){
        System.out.println(accountNumber);
    }
}
