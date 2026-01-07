package w10;


/**
 * Write a description of class BankingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankingApp
{
    public static void main(){
        SavingAccount acc1=new SavingAccount (100101,"Aryan",100000);
        CurrentAccount acc2=new CurrentAccount (100102,"khushi",500000);
        
        double interest1=acc1.calculateCompoundInterest(5);
        double interest2=acc2.calculateCompoundInterest(5);
        
        System.out.println("CI of saving acc="+interest1);
        System.out.println("CI of current acc="+interest2);
    }
}