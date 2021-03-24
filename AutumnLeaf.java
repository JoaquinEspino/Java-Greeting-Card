/**
 * The AutumnLeaf class creates a 2d object composed of the Pentagon and Circle classes. It implements the DrawingObject interface.
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
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class AutumnLeaf implements DrawingObject{
    private double x;
    private double y;
    private Color color;
    private double size, r;
    
    public AutumnLeaf(double x, double y, double s, Color c){
        this.x = x;
        this.y = y;
        size = s;
        color = c;
        r = 0;
    }
    
    public void draw(Graphics2D g2d){//draws the AutumnLeaf using Pentagon and Circle objects
        Pentagon penta1 = new Pentagon(x, y, size, color);
        AffineTransform reset = g2d.getTransform();
        g2d.rotate(Math.toRadians(r),x+(size/2),y+(size/2));
        penta1.draw(g2d);
        g2d.setTransform(reset);
        Pentagon penta2 = new Pentagon(x, y, size, color);
        g2d.rotate(Math.toRadians(r+45),x+(size/2),y+(size/2));
        penta2.draw(g2d);
        g2d.setTransform(reset);
        Pentagon penta3 = new Pentagon(x, y, size, color);
        g2d.rotate(Math.toRadians(r+90),x+(size/2),y+(size/2));
        penta3.draw(g2d);
        g2d.setTransform(reset);
        Pentagon penta4 = new Pentagon(x, y, size, color);
        g2d.rotate(Math.toRadians(r+135),x+(size/2),y+(size/2));
        penta4.draw(g2d);
        g2d.setTransform(reset);
        Pentagon penta5 = new Pentagon(x, y, size, color);
        g2d.rotate(Math.toRadians(r+180),x+(size/2),y+(size/2));
        penta5.draw(g2d);
        g2d.setTransform(reset);
        Pentagon penta6 = new Pentagon(x, y, size, color);
        g2d.rotate(Math.toRadians(r+225),x+(size/2),y+(size/2));
        penta6.draw(g2d);
        g2d.setTransform(reset);
        Pentagon penta7 = new Pentagon(x, y, size, color);
        g2d.rotate(Math.toRadians(r+270),x+(size/2),y+(size/2));
        penta7.draw(g2d);
        g2d.setTransform(reset);
        Pentagon penta8 = new Pentagon(x, y, size, color);
        g2d.rotate(Math.toRadians(r+315),x+(size/2),y+(size/2));
        penta8.draw(g2d);
        g2d.setTransform(reset);
        Circle center = new Circle(x+size/4, y+size/4, size/2, Color.YELLOW);
        center.draw(g2d);
    }
    public void AutumnSpin(double distance){// This method causes the object to spin
        r += distance;
    }
}
