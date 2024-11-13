//javac surfacearea_volume_cylinder.java 
// java surfacearea_volume_cylinder

public class surfacearea_volume_cylinder{
    public static void main(String args[])
    {
        double r=5,h=10;
        double surfacearea,volume;
        System.out.println(r);
        System.out.println(h);
        surfacearea = 2*3.14*r*r+2*3.14*r*h;
        System.out.println("surfacearea = " + surfacearea);
        volume = 3.14*r*r*h;
        System.out.println("volume = " + volume);
    }
}