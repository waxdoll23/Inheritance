package bankAccount;

/**
 * Created by jennifermcginty on 5/5/17.
 */
public class SavingsAccount extends Account {


    public SavingsAccount(String name, double accountBalance){
        this.accountName= name;
        this.accountBalance= accountBalance;
    }


    public double depositToAccountBalance(double depositAmount) {
        double newAccountBalance = accountBalance += depositAmount;
        return newAccountBalance;
    }



    public double withdrawalFromAccountBalance(double withdrawalAmount) {
        if(accountBalance> withdrawalAmount){
            double newAccountBalance= accountBalance -=withdrawalAmount;
            return newAccountBalance;
        }
        else{
            System.out.println("You do not have the funds to withdrawal from the account");
            return accountBalance;
        }

    }

}
