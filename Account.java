import java.text.DecimalFormat;
import java.util.*;
public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyformat = new DecimalFormat("'$' ###,##0.00");

    public int setcustomernumber(int customernumber){
        this.customernumber = customernumber;
        return customernumber;
    }
    public int getcustomernumber(){
        return customernumber;
    }
    public int setpinnumber(int pinnumber){
        this.pinnumber = pinnumber;
        return pinnumber;
    }
    public int getpinnumber() {
        return pinnumber;
    }
    public double getcheckingbalance() {
        return checkingbalance;
    }
    public double getsavingbalance(){
        return savingbalance;
    }

    public double calccheckingwithdraw(double amount){
        checkingbalance = (checkingbalance - amount);
        return checkingbalance;
    }
    public double calcsavingwithdraw(double amount){
        savingbalance = (savingbalance - amount);
        return savingbalance;
    }
    public double calccheckingdeposit(double amount){
        checkingbalance = (checkingbalance+amount);
        return checkingbalance;
    }
    public double calcsavingdeposit(double amount){
        savingbalance = (savingbalance+amount);
        return savingbalance;
    }
    public void getcheckingwithdrawinput(){
        System.out.println("Checking Account Balance: " + moneyformat.format(checkingbalance));
        System.out.println("Account you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingbalance - amount) >= 0) {
            calccheckingwithdraw(amount);
            System.out.println(("New Checking Account Balance: " + moneyformat.format(checkingbalance)));
        }
        else{
            System.out.println("Balance cannot be negative: " + "\n");
        }
    }

    public void getsavingwithdrawinput() {
        System.out.println("Saving Account Balance: " + moneyformat.format(savingbalance));
        System.out.println("Amount you want to withdraw from saving account: ");
        double amount = input.nextDouble();

        if((savingbalance - amount) >= 0){
            calcsavingwithdraw(amount);
            System.out.println("New Saving Account Balance: " + savingbalance + "\n");
        }
        else{
            System.out.println("Balance cannot be negative" + "\n");
        }
    }

    public void getcheckingdepositinput(){
        System.out.println("Checking Account Balance:" + moneyformat.format(checkingbalance));
        System.out.print("Account you want to deposit from Checking Account:");
        double amount = input.nextDouble();

        if((checkingbalance + amount) >= 0){
            calccheckingdeposit(amount);
            System.out.println("New checking account balance: " + moneyformat.format(checkingbalance));
        }
        else{
            System.out.println("Balance cannot be negative " + "\n");
        }
    }
    public void getsavingdepositinput() {
        System.out.println("Saving Account Balance: " + moneyformat.format(savingbalance));
        System.out.println("Amount you want to deposit from saving account: ");
        double amount = input.nextDouble();

        if((savingbalance + amount) >= 0){
            calcsavingdeposit(amount);
            System.out.println("New Saving Account Balance: " + moneyformat.format(savingbalance));
        }
        else{
            System.out.println("Balance cannot be negative" + "\n");
        }
    }
    private int customernumber;
    private int pinnumber;
    private double checkingbalance=0;
    private double savingbalance = 0;
}
