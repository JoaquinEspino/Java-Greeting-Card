/**
 * The BeachBall class creates a 2d object with the Circle class and curves to make a beach ball shape. It implements the DrawingObject interface.
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
public class BeachBall implements DrawingObject{
    private double x;
    private double y;
    private double size;
    private double rm;
    private boolean bol;
    
    public BeachBall(double x, double y, double s){
        this.x = x;
        this.y = y;
        size = s;
        rm = 0;
        bol = true;
        
    }
    public void draw(Graphics2D g2d){// draws the beach ball using the Cirlce class and paths
        Circle bigCircle = new Circle((rm/2)+x, y, size, new Color(30,144,255));
        bigCircle.draw(g2d);
        Path2D.Double leaf = new Path2D.Double();
        leaf.moveTo((rm/2)+x, y+(size/2));
        leaf.curveTo((rm/2)+x+(size/3), y+(size/4), rm/2+x+(size*2/3), y+(size/4), rm/2+x+size, y+(size/2));
        leaf.curveTo((rm/2)+x+(size*2/3), y+(size*3/4), rm/2+x+(size/3), y+(size*3/4), rm/2+x, y+(size/2));
        AffineTransform reset = g2d.getTransform();
        g2d.rotate(Math.toRadians(rm),rm/2+x+(size/2),y+(size/2));
        g2d.setColor(Color.WHITE);
        g2d.fill(leaf);
        g2d.setTransform(reset);
        
        
        
        
        
    }
    
    public void rotateandmove(double distance){// rotates and moves the beach ball forwards and backwards
        if(bol == true){
            rm += distance;
            if(rm+x==1024){
                bol = false;
               }
            }
            else if(bol==false){
                rm -= distance;
                if(rm+x==768){
                bol = true;
                }
            }
        
    }
            
}
