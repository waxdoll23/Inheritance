package bankAccount;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/5/17.
 */
public class SavingsAccountTest {

    SavingsAccount accountBalance;
    @Before
    public void setUp(){
        accountBalance= new SavingsAccount("Account Name", 150);
    }


    @Test

    public void testSavingsAccountDeposit(){
        //given
        double expectedResult=350;

        //when
        double actualResult= accountBalance.depositToAccountBalance(200);
        //then
        Assert.assertEquals("Should return the accountBalance + the deposit amount", expectedResult, actualResult, 0);

    }

    @Test

    public void testSavingsAccountWithdrawal(){
        //given
        double expectedResult = 80;

        //when
        double actualResult= accountBalance.withdrawalFromAccountBalance(70);

        //then

        Assert.assertEquals("Should subtract the withdrawal amount from the account balance", expectedResult, actualResult, 0);
    }

    @Test

    public void testSavingsAccountWhenWithdrawalLargerThanAccountBalance(){
        //given
        double expectedResult= 150;

        //when
        double actualResult= accountBalance.withdrawalFromAccountBalance(200);

        //then

        Assert.assertEquals("Should not allow you to withdrawal more money than is in the account", expectedResult, actualResult, 0);
    }

}
