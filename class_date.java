// javac class_date.java
// java class_date

import java.util.Scanner;
public class class_date{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int dd = S.nextInt();
        int mm = S.nextInt();
        int yyyy = S.nextInt();

        if(mm>12 || mm<0){
            System.out.println("invalid");
        }
        else{
            if( (mm==1) || (mm==3) || (mm==5) || (mm==7) || (mm==8) || (mm==10) || (mm==12) ){
                if(dd>31 || dd<0){
                    System.out.println("invalid");
                }
            }
            else if(mm==4 || mm==6 || mm==9 || mm==11){
                if(dd>30 || dd<0){
                    System.out.println("invalid");
                }
            }
            else{
                int leap_year;
                leap_year=yyyy/4;
                System.out.println("leap_year" + leap_year);
                if(leap_year == 0){
                    if(dd>29 || dd<0){
                        System.out.println("invalid");
                    }
                }else{
                    if(dd>28 || dd<0){
                            System.out.println("invalid");
                    }
                }
            }
        }
    }
}