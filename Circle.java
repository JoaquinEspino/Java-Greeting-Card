/**
 * Th Circle class creates a 2d Circle object and it implements the DrawingObject interface.
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
public class Circle implements DrawingObject {
    private double x;
    private double y;
    private double size;
    private Color color;
    
    public Circle(double x, double y, double s, Color c){
        this.x = x;
        this.y = y;
        size = s;
        color = c;
    }
    
    @Override
    public void draw(Graphics2D g2d){
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(circle);
        
    }
}
