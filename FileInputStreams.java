// javac FileInputStreams.java
// java FileInputStreams

import java.io.*;

class FileInputStreams{
    public static void main(String[] args) throws IOException,FileNotFoundException {
        File f = new File("Ball.txt");
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream("NewBall.txt");
        int value;
        while((value=fis.read()) != -1){
            System.out.print((char)value);
            fos.write(value);
        }
        fis.close();
        fos.close();
    }
}