// javac class_employee_inhertance.java
// java class_employee_inhertance

// Define a class Employee having members id, name, department, salary. Create a 
//  subclass called manager with member bonus. Define methods accept and display in 
//  both the classes. Create n objects of the manager class and display the details of the 
//  manager having the maximum total salary (salary+bonus).

import java.util.Scanner;
class saving_account{
      
      int id;
      String name;
      String department;
      int salary;

    void saving_account_accept(int id,int salary,String name,String department){
        this.id=id;
        this.salary=salary;
        this.name=name;
        this.department=department;
      }
    void saving_account_display(){
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("department="+department);
        System.out.println("salary="+salary);
      }
      }

public class savingaccount(saving_account){
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    saving_account[] arr=new saving_account[n];
    for(int i=0;i<n;i++){
        arr[i]=new saving_account();
        arr[i].saving_account_accept(sc.nextInt(),sc.nextInt(),sc.next(),sc.next());
        }
        obj.saving_account_accept();
        obj.saving_account_display();
    }
  }