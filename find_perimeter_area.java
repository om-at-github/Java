// javac find_perimeter_area.java
// java find_perimeter_area

public class find_perimeter_area{
    public static void main(String args[])
    {
        double a=10,b=90;
        double perimeter,area;

        perimeter=2*3.14*(a+b);
        System.out.println("perimeter = " + perimeter);

        area=3.14*(a*a-b*b);
        System.out.println("area = " + area);
    }
}