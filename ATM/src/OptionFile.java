import java.util.Scanner;

public class OptionFile extends Account {


 public void getLogin(){



     getAccountType();

 }
    public void getAccountType (){
        System.out.println("Select The Account Type :");
        System.out.println("Type 1  Saving Account");
        System.out.println("Type 2 Checking Account");
        System.out.println("Type 3 Exit");

        int selection = sc.nextInt();

        switch(selection){

            case 1 :
                getSaving();
                break;

            case 2:
                getChecking();
                break;

            case 3:
                System.out.println("Thank You");
                break;
            default :
                System.out.println("Enter Valid Selection");

        }

    }

    public void getChecking() {
        System.out.println("Checking Account :");
        System.out.println("Type 1  View balance");
        System.out.println("Type 2  Withdraw Ammount");
        System.out.println("Type 3  Deposit Ammount");
        System.out.println("Type 4  Exit");

        int selection = sc.nextInt();

        switch(selection){

            case 1 :
                System.out.println("Account Balance is :"+cbalance);
                getChecking();
                break;

            case 2:
                getCheckingWithdrawInput();
                getChecking();
                break;
            case 3:
                getCheckingDepositInput();
                getChecking();
                break;

            case 4:
                System.out.println("Thank You");
                getAccountType();
                break;
            default :
                System.out.println("Enter Valid Selection");

        }


    }

    public void getSaving(){
        System.out.println("Saving Account :");
        System.out.println("Type 1  View balance");
        System.out.println("Type 2  Withdraw Ammount");
        System.out.println("Type 3  Deposit Ammount");
        System.out.println("Type 4  Exit");

        int selection = sc.nextInt();

        switch(selection){

            case 1 :
                System.out.println("Account Balance is :"+sbalance);
                getSaving();
                break;

            case 2:
                getSavingWithdrawInput();
                getSaving();
                break;
            case 3:
                getSavingDepositInput();
                getSaving();
                break;

            case 4:
                System.out.println("Thank You");
                getAccountType();
                break;
            default :
                System.out.println("Enter Valid Selection");

        }

    }




}
