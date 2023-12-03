import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
public class OptionMenu extends Account{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyformat = new DecimalFormat("'$' ###,##0.00");
    HashMap<Integer , Integer> data = new HashMap<Integer , Integer>();

    public void getlogin() throws IOException {
        int x=1;
        do{
            try{
                data.put(9876542, 9876);
                data.put(8989898, 1890);
                data.put(89878898, 1891);

                System.out.println("Welcome to the ATM Project!");

                System.out.println("Enter Your Customer Number: ");
                setcustomernumber(menuInput.nextInt());

                System.out.println("Enter Your Pin Number: ");
                setpinnumber(menuInput.nextInt());

            } catch (Exception e) {
                System.out.println("\n" + "Invalid character(s).Only Numbers." + "\n");
                x=2;
            }

            for (Map.Entry <Integer,Integer> entry : data.entrySet()){
                if (entry.getKey() == getcustomernumber() && entry.getValue() == getpinnumber()){
                    getAccountType();
                }

            }

            System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
        }
        while (x==1);
    }
    public void getAccountType(){
        System.out.println("Select the Account you want to access");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection){
            case 1:
                getChecking();
                break;

            case 2:
                getSaving();
                break;

            case 3:
                System.out.println("Thank You for using this ATM , bye");
                break;
            default:
                System.out.println("\n" + "Invalid choice " + "\n");
                getAccountType();
        }
    }
    public void getChecking(){
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance: " + moneyformat.format(getcheckingbalance()));
                getAccountType();
                break;
            case 2:
                getcheckingwithdrawinput();
                getAccountType();
                break;
            case 3:
                getcheckingdepositinput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM , bye");
                break;
            default:
                System.out.println("\\n\" + \"Invalid choice \" + \"\\n");
                getChecking();
        }
    }
    public void getSaving() {
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Savings Account Balance: " + moneyformat.format(getsavingbalance()));
                getAccountType();
                break;
            case 2:
                getsavingwithdrawinput();
                getAccountType();
                break;
            case 3:
                getsavingdepositinput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM , bye");
                break;
            default:
                System.out.println("\\n\" + \"Invalid choice \" + \"\\n");
                getSaving();
        }

    }
    int selection;

}
