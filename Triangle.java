/**
 * The Triangle class creates 2 path objects that forms a triangle and it implements the DrawingObject interface.
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
public class Triangle implements DrawingObject{
    private double x;
    private double y;
    public double size;
    private Color color;
    
    public Triangle(double x, double y, double s, Color c){
        this.x = x;
        this.y = y;
        color = c;
        size = s;
    }
    @Override
    public void draw(Graphics2D g2d){
        Path2D.Double triangle = new Path2D.Double();
        triangle.moveTo(x, y);
        triangle.lineTo(x+size, y);
        triangle.lineTo(x+(size/2), y+size/2);
        triangle.lineTo(x, y);
        g2d.setColor(color);
        g2d.fill(triangle);
    }
}
