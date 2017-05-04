package bankAccount;

/**
 * Created by jennifermcginty on 5/3/17.
 */
public class CheckingAccount extends Account {

    public CheckingAccount(String accountName, double accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;

    }


    public double depositToCheckingAccountBalance(double depositAmount) {
        double newAccountBalance = accountBalance + depositAmount;
        return newAccountBalance;
    }

    public double withdrawalFromCheckingAccountBalance(double withdrawalAmount) {
        if (withdrawalAmount > accountBalance) {
            System.out.println("Warning: you have overdrawn your account");
        }
        double newAccountBalance = accountBalance - withdrawalAmount;
        return newAccountBalance;
    }

}
