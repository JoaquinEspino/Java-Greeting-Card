
/**
 * The Sun class creates a 2d object that uses the Circle and Square classes to form a sun. It also implements the DrawingObject interface.
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
public class Sun implements DrawingObject{
    private Circle circle;
    private Square square, square2;
    private double x;
    private double y;
    private Color colorSun;
    private Color colorRay;
    private double size;
    private double rotate1;
    private double rot;
    
    public Sun(double x, double y, double sz, Color s, Color r){
        this.x = x;
        this.y = y;
        colorSun = s;
        colorRay = r;
        size = sz;
        rotate1 = 5;
        rot = 0;
        
    }
    @Override
    public void draw(Graphics2D g2d){
        square = new Square(x, y, size, size, colorRay);
        AffineTransform reset = g2d.getTransform();
        square.rotateRays(rot);
        square.draw(g2d);
        g2d.setTransform(reset);
        square2 = new Square(x, y, size, size, colorRay);
        square2.rotateRays(rot+45);
        square2.draw(g2d);
        g2d.setTransform(reset);
        circle = new Circle(x, y, size, colorSun);
        circle.draw(g2d);
        g2d.setTransform(reset);
        
        
       
    }
    public void spinRay(double distance){//This method rotates the rays of the sun to make them spin.
        rot += distance;
    }
    
}
