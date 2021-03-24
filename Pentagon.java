/**
 * The Pentagon class creates a 2d object composed of a rectangle and paths that create a pentagon shape. It implements the DrawingObject interface.
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
public class Pentagon implements DrawingObject  {
    private double x;
    private double y;
    private Color color;
    private double size;
    
    public Pentagon(double x, double y, double s, Color c){
        this.x = x;
        this.y = y;
        size = s;
        color = c;
    }
    
    public void draw(Graphics2D g2d){//draws a pentagon using Rectangles and Paths
        Rectangle2D.Double base = new Rectangle2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(base);
        Path2D.Double top = new Path2D.Double();
        top.moveTo(x, y);
        top.lineTo(x + size/2, y - size/2);
        top.lineTo(x + size, y);
        top.lineTo(x, y);
        g2d.setColor(color);
        g2d.fill(base);
        
    }
}
