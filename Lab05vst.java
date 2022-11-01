// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10,10,width,height);
        //
      // int x=25;
       //int y=6;
      /// int x3=990;
       // int y3=25;
        for(int k = 0; k< 35;k++){
            g.drawLine(x1,y1,x2,y2);
            x1 += 28;
            y2 -= 18;

        }

  x1 = 990;
        x2 = 10;
        y1 = 640;
        y2 = 640;
        for(int k = 0; k< 35;k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 -= 28;
            y2 -= 18;
        }

x1= 10;
        x2=990;
        y1 = 10;
        y2 = 10;
        for(int k = 0; k< 35;k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 28;
            y2 += 18;
        }


        x1 = 990;
        y1 = 10;
        x2 = 10;
        y2 = 10;
        for(int k = 0; k< 35;k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 -= 28;
            y2 += 18;

        }
        width = 500;
        height = 308;
        x1 = 250;
        y1 = 171;
        x2 = 750;
        y2 = 171;
        g.drawRect(250,171,width,height);
        for(int k = 0; k< 40;k++){
            g.drawLine(x1,y1,x2,y2);
            x1 += 12.4;
            y2 += 8.8;

        }
        x1 = 250;
        y1 = 171;
        x2 = 750;
        y2 = 171;

        for(int k = 0; k< 40;k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 -= 12.4;
            y2 += 8.8;
        }
        x1 = 250;
        y1 = 171;
        x2 = 750;
        y2 = 171;

        for(int k = 0; k< 40;k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 -= 12.4;
            y2 -= 8.8;
        }


}










    }
//}

