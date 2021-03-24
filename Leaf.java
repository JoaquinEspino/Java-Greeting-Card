/**
 * The Leaf class creates 2d curve objects that is shaped like a leaf. It also implements the DrawingObject interface.
 *
 * Joaquin D. Espino
 * April 4, 2019
 */

/*
I have not discussed the Java language code 
in my program with anyone other than my instructor 
or the teaching assistants assigned to this course.

I have not used Java language code obtained 
from another student, or any other unauthorized 
source, either modified or unmodified.

If any Java language code or documentation 
used in my program was obtained from another source, 
such as a text book or webpage, those have been 
clearly noted with a proper citation in the comments 
of my code.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class Leaf implements DrawingObject{
    private double x;
    private double y;
    private Color color;
    private double rotate;
    private double a;
    
    public Leaf(double x, double y, Color c){
        this.x = x;
        this.y = y;
        color = c;
        a = 0;
    }
    
    public void draw(Graphics2D g2d){
        Path2D.Double leaf = new Path2D.Double();
        leaf.moveTo(x, a+y);
        leaf.curveTo(x-10, a+y-10, x-10, a+y-20, x, a+y-30);
        leaf.curveTo(x+10, a+y-20, x+10, a+y-10, x, a+y);
        g2d.rotate(Math.toRadians(rotate),x,y);
        g2d.setColor(color);
        g2d.fill(leaf);
    }
    public void rotateleaf(double distance){ //This method allows you to spin the Leaf object to be used in a degree that you want.
        rotate += distance;
    }
    public void dropleaf(double distance){//This method causes the leaf to drop by 50 pixels then it resets to its original positon.
        a += distance;
        if(a==50){
            a = 0;
        }
    }
}
