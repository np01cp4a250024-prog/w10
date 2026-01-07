package w10;


/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingAccount extends BankAccount
{
    public SavingAccount(long accountNumber, String holderName, double balance)
    {
        super(accountNumber, holderName, balance);
    }
    @Override
    protected double getInterest()
    {
        return 2.0;
    }
}