import java.util.*;
class bankAccount
{
    Scanner sc=new Scanner(System.in);
    static float balance;
    float amount,withdrawamount;

    void Account(int bal)
    {
        balance=bal;
        //System.out.println("Available balance : "+balance);
    }
    void withdraw()
    {
        System.out.println("Enter the amount to be withdraw :");
        withdrawamount=sc.nextFloat();

        if(withdrawamount>balance)
        {
            System.out.println("Cannot be withdraw the amount!!");
        }
        else
        {
            balance=balance-withdrawamount;
            System.out.println("Withdrawn Successfully!!");
            System.out.println("Available balance : "+balance);
        }
    }

    void deposit()
    {
        System.out.println("Enter the amount to be deposit :");
        amount=sc.nextFloat();
        balance=balance+amount;
        System.out.println("Deposit Successfully!!");
        System.out.println("Available balance : "+balance);
    }

    void checkBalance()
    {
        System.out.println("Available balance : "+balance);
    }
}

class atm
{
    bankAccount b1=new bankAccount();

    Scanner sc = new Scanner(System.in);
    int ch;
    void input()
    {
        do
        {
            System.out.println("");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("Enter the Choice");
            ch=sc.nextInt();

            switch (ch) {
                case 1:
                    b1.checkBalance();
                    break;
                case 2:
                    b1.deposit();
                    break;
                case 3:
                    b1.withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM !!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }while(ch!=4);
    }

}

public class second {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int pin;
        bankAccount b=new bankAccount();;
        System.out.println("Welcome to ATM !!");
        System.out.println("Enter the four digit PIN :");
        pin=sc.nextInt();

        if(pin>=1000 && pin<=2000)
        {
            b.Account(1000);
            atm a=new atm();
            a.input();
        }
    }
}
