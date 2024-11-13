// javac find_surfacearea_volume.java
// java find_surfacearea_volume

public class find_surfacearea_volume{
    public static void main(String args[])
    {
        int l=10,b=200,h=486;
        int surfacearea,volume;

        surfacearea=2*(l*b+l*h+b*h);
        volume=l*b*h;

        System.out.println("surfacearea = " + surfacearea);
        System.out.println("volume = " + volume);
    }
}