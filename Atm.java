import java.util.Scanner;
class Atm
{
public static void deposit(int balance,int amount){
    if(amount>0){
        balance+=amount;
        System.out.println("Deposit Succesfull !");
        System.out.println("Current Balance : " + "["+balance+"]");
        System.out.println("");
        
    }
    else{
        System.out.println("invalid amount");
        System.out.println("");

    }
}

public static void withdraw(String accountholder,int balance,int amount){
    if (amount>0 && amount<=balance){
        balance-=amount;
        System.out.println(accountholder+" Withdraw successfull !");
        System.out.println("Your Current Balance :" +"["+balance+"]");
        System.out.println("");
    }
    else if(amount > balance){
        System.out.println("inefficient balance");
        System.out.println("");

    }
    else{
        System.out.println("invalid amount");
        System.out.println("");
    }


}
public static void checkBalance(int balance){
    System.out.println("Your Total Balance :" + "["+balance+"]");
    System.out.println("");
            
}

public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter account holder name :");
    String accountholder=sc.nextLine();

    System.out.println("Enter intial Balance :");
    int balance=sc.nextInt();
     
    while (true) {
        System.out.println("Welcome Atm !!!");
          System.out.println("1 - Deposit");
          System.out.println("2 - Withdraw");
          System.out.println("3 - Check Balance");
          System.out.println("4 Exit :) ");
        System.out.println("");

          System.out.println("Choose Option");

          int option=sc.nextInt();
            if(option == 1){
                System.out.println("Enter the deposit Amount : ");
                int amount=sc.nextInt();
                deposit(balance,amount);
            }
            else if (option == 2){
                System.out.println("Enter the Withdraw amount : ");
                int amount=sc.nextInt();
                withdraw(accountholder, balance, amount);
            }
            else if (option == 3){
                checkBalance(balance);
            }
                
            else if (option == 4){
                    System.out.println("Thanks for Using MY ATM :");
                    break;
            }
            else{
                System.out.println("Invalid option / pls try again");
                System.out.println("");
            }
        }
    sc.close();
 }

}