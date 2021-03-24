/**
 * The Snow class creates a 2d object that uses the circle and line classes to make a snow. It also implements the DrawingObject interface.
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
public class Snow implements DrawingObject{
    private double x;
    private double y;
    private double size;
    private Color color;
    
    public Snow(double x, double y, double s, Color c){
        this.x = x;
        this.y = y;
        color = c;
        size = s;
    }
    
    public void draw(Graphics2D g2d){
        //This is the center of the snow
        Circle circle = new Circle(x, y, size, color );
        circle.draw(g2d);
        //These are the points surrounding the snow
        Line line1 = new Line(x+(size/2), y+(size/2), x+(size/2), y-(size/4), 1, color );
        AffineTransform reset = g2d.getTransform();
        line1.draw(g2d);
        Line line2 = new Line(x+size/2, y+size/2, x+size/2, y-(size/4), 1, color );
        g2d.rotate(Math.toRadians(45),x+(size/2),y+(size/2));
        line2.draw(g2d);
        g2d.setTransform(reset);
        Line line3 = new Line(x+size/2, y+size/2, x+size/2,y-(size/4), 1, color );
        g2d.rotate(Math.toRadians(90),x+(size/2),y+(size/2));
        line3.draw(g2d);
        g2d.setTransform(reset);
        Line line4 = new Line(x+size/2, y+size/2, x+size/2, y-(size/4), 1, color );
        g2d.rotate(Math.toRadians(135),x+(size/2),y+(size/2));
        line4.draw(g2d);
        g2d.setTransform(reset);
        Line line5 = new Line(x+size/2, y+size/2, x+size/2, y-(size/4), 1, color );
        g2d.rotate(Math.toRadians(180),x+(size/2),y+(size/2));
        line5.draw(g2d);
        g2d.setTransform(reset);
        Line line6 = new Line(x+size/2, y+size/2, x+size/2, y-(size/4), 1, color );
        g2d.rotate(Math.toRadians(225),x+(size/2),y+(size/2));
        line6.draw(g2d);
        g2d.setTransform(reset);
        Line line7 = new Line(x+size/2, y+size/2, x+size/2, y-(size/4), 1, color );
        g2d.rotate(Math.toRadians(270),x+(size/2),y+(size/2));
        line7.draw(g2d);
        g2d.setTransform(reset);
        Line line8 = new Line(x+size/2, y+size/2, x+size/2, y-(size/4), 1, color );
        g2d.rotate(Math.toRadians(315),x+(size/2),y+(size/2));
        line8.draw(g2d);
        g2d.setTransform(reset);
        
    }
    public void Falling(double distance){ //This method drops the snow object by 800 pixels and resets it off screen.
        y += distance;
        if(y==800){
            y = -100;
        }
    }
    
}
