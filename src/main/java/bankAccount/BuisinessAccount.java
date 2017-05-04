package bankAccount;

/**
 * Created by jennifermcginty on 5/4/17.
 */

public class BuisinessAccount extends Account {


    public BuisinessAccount(String accountName, double accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;


    }

    public double depositToBuisinessAccountBalance(double depositAmount) {
        if(depositAmount >=100) {
            double newAmount = accountBalance + depositAmount;
            return newAmount;
        }
        else {
            System.out.print("You can't deposit less then $100.");
            return  accountBalance;
        }


    }


    public double withDrawFromBuisinessAccountBalance(double withDrawAmount){
        double newAmount = accountBalance - withDrawAmount;

        if(newAmount < 0){
            System.out.println("Warning : You are about to overdraw.");
        }

        return  newAmount;
    }
}
