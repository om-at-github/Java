// javac class_saving_account.java
// java class_saving_account
// Define a class saving account (acno, name, balance) .define appropriate and operation withdraw(), deposit(), and viewbalance(). The minimum balance must be 500. Create an object and perform operation. Raise user defined “InsufficientFundException” when balance is not sufficient for withdraw operation.

import java.util.Scanner;

class saving_account{
      
      int acc_no;
      int bal;
      String name;

      saving_account(int acc_no,int bal,String name){
        this.acc_no=acc_no;
        this.bal=bal;
        this.name=name;
      }

      void deposit(int amount){
        bal= bal+amount;
        System.out.println(" amount added ");
      }
      
      void withdraw(int amount){
        if(bal <= 500){
            System.out.println("cannot withdraw amount less than 500 ");
        }
        else{
              bal = bal - amount ;
              System.out.println("Remaining bal"+bal);
        }
      }
}


public class class_saving_account{
  public static void main(String[] args){
    try (Scanner s = new Scanner(System.in)) {

        System.out.println("enter the name");
        String name = s.nextLine();
        System.out.println("enter the account no");
        int acc_no = s.nextInt();
        System.out.println("enter the bal");
        int bal = s.nextInt();
    
        saving_account obj = new saving_account(acc_no,bal,name);

        System.out.println("Select your choice!!!");
        System.out.println("1.deposite");
        System.out.println("2.withdraw");
        int ch = s.nextInt();

        switch (ch) {
            case 1:System.out.println("enter the = amount to deposit");
                    int dep = s.nextInt();
                    obj.deposit(dep);
                break;
            case 2:System.out.println("enter the = amount to withdraw");
                    int withdraw = s.nextInt();
                    obj.withdraw(withdraw);
                break;
        
            default:System.out.println("Wrong Choice. Try again");
                break;
        }
        int withdraw = s.nextInt();
        obj.withdraw(withdraw);
    }
    }
  }