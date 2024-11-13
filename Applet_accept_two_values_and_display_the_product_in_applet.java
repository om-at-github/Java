// javac Applet_accept_two_values_and_display_the_product_in_applet.java
// java Applet_accept_two_values_and_display_the_product_in_applet

import java.awt.*;
import java.awt.desktop.AppEvent;
import java.applet.*;
import java.awt.event.*;

public class Applet_accept_two_values_and_display_the_product_in_applet extends Applet implements ActionListener
{

   TextField tf1, tf2;
   int x=0,y=0,prod=0;
   String s1,s2,s3;
   Button b1;

   public void init()
   { 
    tf1 = new TextField(10);
    tf2 = new TextField(10);
    b1 = new Button("Click");
    add(tf1);
    add(tf2);
    add(b1);
    tf1.setText("0");
    tf2.setText("0");
    b1.addActionListener(this);
   }

   public void actionPerformed(ActionEvent e)
   {
    if(e.getSource() == b1)
    {
        s1 = tf1.getText();
        x = Integer.parseInt(s1);
        s2 = tf2.getText();
        y =Integer.parseInt(s2);
        prod = x*y;
        repaint();
    }
   }

   public void paint(Graphics g)
   {
    g.drawString("Enter numbers in the given text boxes: " ,10,80);
    g.drawString("Enter Product of the two numbers is: "+ prod,10,200);
   }

}