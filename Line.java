/**
 * The Line class creates a 2d line object and it implements the DrawingObject interface.
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
public class Line implements DrawingObject{
    private double xs;
    private double ys;
    private double xf;
    private double yf;
    private float thickness;
    private Color color;
    
    public Line(double xs, double ys, double xf, double yf, float thick, Color c){
        this.xs = xs;
        this.ys = ys;
        this.xf = xf;
        this.yf = yf;
        thickness = thick;
        color = c;
    }
    @Override
    public void draw(Graphics2D g2d){
       Line2D.Double line = new Line2D.Double(xs, ys, xf, yf);
       g2d.setStroke(new BasicStroke(thickness));/** source to get thickness of lines: 
       https://stackoverflow.com/questions/16995308/can-you-increase-line-thickness-when-using-java-graphics-for-an-applet-i-dont/16995788**/
       g2d.setColor(color);
       g2d.draw(line);
       
    
    }
    
}
