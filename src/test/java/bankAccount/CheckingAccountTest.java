package bankAccount;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/3/17.
 */
public class CheckingAccountTest {

    @Test
    public void testDepositToCheckingAccountBalance(){
        //:given
        CheckingAccount accountBalance = new CheckingAccount("account", 5);
        double expectedResult=20;

        //: When
        double actualResult= accountBalance.depositToCheckingAccountBalance(15);

        //: Then

        Assert.assertEquals("should add value to account balance", expectedResult, actualResult, 0);


    }

    @Test
    public void testWithdrawalFromCheckingAccountBalance(){

        //:given
        CheckingAccount accountBalance =new CheckingAccount("account", 15);

        double expectedResult=5;

        //: when
        double actualResult = accountBalance.withdrawalFromCheckingAccountBalance(10);

        //: then

        Assert.assertEquals("Should reduce the account balance", expectedResult,actualResult,0);

    }

    @Test
    public void testWithdrawalFromCheckingAccountIfGreaterThanBalance(){
        //given
        CheckingAccount accountBalance = new CheckingAccount("Account", 14);
        double expectedResult = -1;

        //when
        double actualResult = accountBalance.withdrawalFromCheckingAccountBalance( 15);

        //then
        Assert.assertEquals("Should return a warning if there is not enough money in the account", expectedResult, actualResult,0);
    }
}


