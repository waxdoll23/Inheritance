package bankAccount;

/**
 * Created by jennifermcginty on 5/3/17.
 */
public abstract class Account {
        String accountName;
        double accountAmount;

        public Account(String accountName, double accountAmount){
            this.accountName = accountName;
            this.accountAmount = accountAmount;
        }

        public double getAccountAmount(){
            return this.accountAmount;
        }

        public void setAccountAmount(){
            this.accountAmount = accountAmount;
        }
}
