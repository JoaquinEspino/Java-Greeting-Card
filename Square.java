/**
 * The Square class creates a 2d Square/Rectangle object and it implements the DrawingObject interface.
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
public class Square implements DrawingObject {
    private double x;
    private double y;
    private double width;
    private double length;
    private Color color;
    private double rotate;
    
    public Square(double x, double y, double w, double l, Color c){
        this.x = x;
        this.y = y;
        width = w;
        length = l;
        color = c;
        rotate = 0;
    }
    
    @Override
    public void draw(Graphics2D g2d){
        Rectangle2D.Double bg = new Rectangle2D.Double(x, y, width, length);
        g2d.rotate(Math.toRadians(rotate),x+(width/2),y+(length/2));
        g2d.setColor(color);
        g2d.fill(bg);
        
        
    }
    
    public void rotateRays(double distance){ //This method rotates the Square objects to be used by other classes.
        rotate += distance;
    }
}
