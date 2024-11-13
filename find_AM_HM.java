// javac find_AM_HM.java
// java find_AM_HM

public class find_AM_HM{
    public static void main(String args[])
    {
        int a=12,b=100;
        int AM,HM;

        AM=(a+b)/2;
        HM=a*b/(a+b);

        System.out.println("AM = " + AM );
        System.out.println("HM = " + HM);
    }
}