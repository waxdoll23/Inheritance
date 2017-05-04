package bankAccount;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jennifermcginty on 5/4/17.
 */
public class BuisinessAccountTest {

    @Test
    public void testDepositToCheckingAccountBalanceIfLessThenOneHundred(){
        BuisinessAccount buisinessAccount = new BuisinessAccount("Account", 10);

        double expectedResult = 10;

        double actualResult = buisinessAccount.depositToBuisinessAccountBalance(20);

        assertEquals("The result should be you can't deposit less then 100", expectedResult, actualResult, 0.5);
    }


    @Test
    public void testDepositToCheckingAccountBalance(){
        BuisinessAccount buisinessAccount = new BuisinessAccount("Account", 100);

        double expectedResult = 120;

        double actualResult = buisinessAccount.depositToBuisinessAccountBalance(20);

        assertEquals("The result should be 120", expectedResult, actualResult,.05);
    }

    @Test
    public void testWithDrawFromBuisinessAccount(){
        BuisinessAccount buisinessAccount = new BuisinessAccount("Account", 100);

        double expectedResult = 90;

        double actualResult = buisinessAccount.withDrawFromBuisinessAccountBalance(10);

        assertEquals("Testing the withdraw function results should be 20", actualResult , expectedResult, 0.5);
    }

    @Test
    public void testWithDrawFromBuisinessAccountButNotIfItOverDraws(){
        BuisinessAccount buisinessAccount = new BuisinessAccount("account", 100);

        double expectedResult = -20;

        double actualResult = buisinessAccount.withDrawFromBuisinessAccountBalance(120);

        assertEquals("This is testing the withdraw overdraw function.", expectedResult, actualResult, .05);

    }
}

