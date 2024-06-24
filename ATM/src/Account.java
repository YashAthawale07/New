import java.util.Scanner;

public class Account {
    Double sbalance=00.00 ;
    Double cbalance =00.00;
    Scanner sc = new Scanner(System.in);
    public void getCheckingWithdrawInput(){
        System.out.println("Your Account Balance is "+cbalance);
        System.out.println();
        System.out.println("Enter Amount For Withdraw");
        double amount =sc.nextInt();
        System.out.println();
        if((cbalance-amount)>=0){
        System.out.println(amount+"  Amount is Withdraw Successfully");
        System.out.println();
        System.out.println("Your New Balance is " +calcCheckingWithdraw(amount));
        System.out.println();
        }
        else {
            System.out.println("You Do not Have Sufficient Amount");
        }
    }
    public void getSavingWithdrawInput() {
        System.out.println("Your Account Balance is "+sbalance);
        System.out.println();
        System.out.println("Enter Amount For Withdraw");
        double amount =sc.nextInt();
        if((sbalance-amount)>=0){
        System.out.println(amount+"  Amount is Withdraw Successfully");
        System.out.println();

        System.out.println("Your New Balance is " +calcSavingWithdraw(amount));
        System.out.println();}
        else {
            System.out.println("You do not Sufficient Amount");
        }
    }





    public void getCheckingDepositInput(){
        System.out.println("Your Account Balance is "+cbalance);
        System.out.println();
        System.out.println("Enter Amount For Deposit");
        double amount =sc.nextInt();
        System.out.println(amount+"  Amount is Deposited Successfully");

        System.out.println("Your New Balance is " +calcCheckingDeposit(amount));

    }
    public void getSavingDepositInput() {
        System.out.println("Your Account Balance is "+sbalance);
        System.out.println();
        System.out.println("Enter Amount For Deposit");
        double amount =sc.nextInt();
        System.out.println(amount+"  Amount is Deposited Successfully");

        System.out.println("Your New Balance is " +calcSavingDeposit(amount));
    }
    public Double calcSavingWithdraw(double amount) {
         sbalance = sbalance - amount;
        return sbalance;
    }
    public Double calcSavingDeposit(double amount) {
         sbalance = sbalance + amount;
        return sbalance;
    }

    public Double calcCheckingWithdraw(double amount) {
        cbalance = cbalance - amount;
        return cbalance;
    }
    public Double calcCheckingDeposit(double amount) {
        cbalance = cbalance + amount;
        return cbalance;
    }

}
