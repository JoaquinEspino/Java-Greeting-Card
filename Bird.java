/**
 * The Bird class creates a 2d object composed of Triangles, Circles and Paths to form a shape of a bird. It implements the DrawingObject interface.
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
public class Bird implements DrawingObject{
    private double x;
    private double y;
    public double size;
    private Color colorbird;
    private Color colorbeak;
    private double a;
    private boolean bol;
    
    public Bird(double x, double y, double s, Color cd, Color ck){
        this.x = x;
        this.y = y;
        size = s;
        colorbird = cd;
        colorbeak = ck;
        a = 0;
        bol = true;
    }
    
    public void draw(Graphics2D g2d){//draws the bird using paths and the Circle class
        Path2D.Double wings = new Path2D.Double();
        wings.moveTo(x+(size/2), a+y+(size/2));
        wings.lineTo(x+(size/4), a+y+(size/4));
        wings.lineTo(x-(size/4), a+y+(size/4));
        wings.lineTo(x-(size/2), a+y+(size/2));
        g2d.setColor(colorbird);
        g2d.setStroke(new BasicStroke(4));
        g2d.draw(wings);
        Path2D.Double wings2 = new Path2D.Double();
        wings2.moveTo(x+(size/2), a+y+(size/2));
        wings2.lineTo(x+(size*3/4), a+y+(size/4));
        wings2.lineTo(x+(size*5/4), a+y+(size/4));
        wings2.lineTo(x+(size*6/4), a+y+(size/2));
        g2d.setColor(colorbird);
        g2d.setStroke(new BasicStroke(4));
        g2d.draw(wings2);
        Circle head = new Circle( x, a+y, size, colorbird );
        head.draw(g2d);
        Triangle beak = new Triangle(x+(size/4), a+y+(size/2), size/2, colorbeak);
        beak.draw(g2d);
        
        
    }
    public void dropbird(double distance){ // moves the bird down and up by 50 pixels
        if(bol == true){
            a += distance;
            if(a>=50){
                bol = false;
               }
            }
            else if(bol==false){
                a -= distance;
                if(a<=0){
                bol = true;
                }
            }
    }
    public void upbird(double distance){ // moves the bird up and down by 50 pixels
        if(bol == true){
            a -= distance;
            if(a==-50){
                bol = false;
               }
            }
            else if(bol==false){
                a += distance;
                if(a==0){
                bol = true;
                }
            }
    }
}
