package w10;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private long accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(long accountNumber, String holderName, double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public void setAccountNumber(long newAccountNumber)
    {
        this.accountNumber=newAccountNumber;
    }
    public long getAccountNumber(long newAccountNumber)
    {
        return this.accountNumber;
    }
    public double getBalance()
    {
        return this.balance;
    }
    protected double getInterest()
    {
        return 0.0;
        
    }
    
    public double calculateCompoundInterest(double years)
    {
        return((this.getBalance()*this.getInterest()*years)/100);
    }
}
