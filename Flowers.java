/**
 * The Flowers class creates a 2d object that uses an ellipse objects to form flower shape. It implements the DrawingObject interface.
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
public class Flowers implements DrawingObject{
    private double x;
    private double y;
    public double size;
    private Color color;
    private double r;
    
    public Flowers(double x, double y, double s, Color c){
        this.x = x;
        this.y = y;
        size = s;
        color = c;
        r = 0;
    }
    
    public void draw(Graphics2D g2d){//draws the flower using Ellipses
        
        Ellipse2D.Double petal1 = new Ellipse2D.Double(x, y, size, size*2);
        AffineTransform reset = g2d.getTransform();
        g2d.rotate(Math.toRadians(r),x+(size/2),y+(size/2));
        g2d.setColor(color);
        g2d.fill(petal1);
        g2d.setTransform(reset);
        Ellipse2D.Double petal2 = new Ellipse2D.Double(x, y, size, size*2);
        g2d.rotate(Math.toRadians(r+45),x+(size/2),y+(size/2));
        g2d.setColor(color);
        g2d.fill(petal2);
        g2d.setTransform(reset);
        Ellipse2D.Double petal3= new Ellipse2D.Double(x, y, size, size*2);
        g2d.rotate(Math.toRadians(r+90),x+(size/2),y+(size/2));
        g2d.setColor(color);
        g2d.fill(petal3);
        g2d.setTransform(reset);
        Ellipse2D.Double petal4 = new Ellipse2D.Double(x, y, size, size*2);
        g2d.rotate(Math.toRadians(r+135),x+(size/2),y+(size/2));
        g2d.setColor(color);
        g2d.fill(petal4);
        g2d.setTransform(reset);
        Ellipse2D.Double petal5 = new Ellipse2D.Double(x, y, size, size*2);
        g2d.rotate(Math.toRadians(r+180),x+(size/2),y+(size/2));
        g2d.setColor(color);
        g2d.fill(petal5);
        g2d.setTransform(reset);
        Ellipse2D.Double petal6 = new Ellipse2D.Double(x, y, size, size*2);
        g2d.rotate(Math.toRadians(r+225),x+(size/2),y+(size/2));
        g2d.setColor(color);
        g2d.fill(petal6);
        g2d.setTransform(reset);
        Ellipse2D.Double petal7 = new Ellipse2D.Double(x, y, size, size*2);
        g2d.rotate(Math.toRadians(r+270),x+(size/2),y+(size/2));
        g2d.setColor(color);
        g2d.fill(petal7);
        g2d.setTransform(reset);
        Ellipse2D.Double petal8 = new Ellipse2D.Double(x, y, size, size*2);
        g2d.rotate(Math.toRadians(r+315),x+(size/2),y+(size/2));
        g2d.setColor(color);
        g2d.fill(petal8);
        g2d.setTransform(reset);
        Circle center = new Circle(x, y, size, Color.YELLOW);
        center.draw(g2d);
        
        
    }
    public void FlowerSpin(double distance){ // This method spins the flowers
        r += distance;
    }
}
