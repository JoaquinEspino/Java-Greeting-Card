/**
 * The Trunk class creates 2d path objects shaped into a tree trunk with branches and it implements the DrawingObject interface.
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
public class Trunk implements DrawingObject{
    private double x;
    private double y;
    private Color color;
    
    public Trunk(double x, double y, Color c){
        this.x = x;
        this.y = y;
        color = c;
    }
    
    @Override
    public void draw(Graphics2D g2d){
        Path2D.Double trunk = new Path2D.Double();
        trunk.moveTo(x, y);
        trunk.lineTo(x, y-62);
        trunk.lineTo(x-41, y-124);
        trunk.lineTo(x-57, y-131);
        trunk.lineTo(x-75, y-122);
        trunk.lineTo(x-57, y-131);
        trunk.lineTo(x-70, y-135);
        trunk.lineTo(x-84, y-152);
        trunk.lineTo(x-70, y-135);
        trunk.lineTo(x-90, y-143);
        trunk.lineTo(x-70, y-135);
        trunk.lineTo(x-57, y-131);
        trunk.lineTo(x-41, y-124);
        trunk.lineTo(x-68, y-170);
        trunk.lineTo(x-25, y-120);
        trunk.lineTo(x-27, y-134);
        trunk.lineTo(x-29, y-150);
        trunk.lineTo(x-27, y-134);
        trunk.lineTo(x-20, y-145);
        trunk.lineTo(x-27, y-134);
        trunk.lineTo(x-25, y-120);
        trunk.lineTo(x+6, y-75);
        trunk.lineTo(x-7, y-160);
        trunk.lineTo(x-30, y-184);
        trunk.lineTo(x-51, y-187);
        trunk.lineTo(x-30, y-184);
        trunk.lineTo(x-49, y-198);
        trunk.lineTo(x-30, y-184);
        trunk.lineTo(x-7, y-160);
        trunk.lineTo(x-11, y-205);
        trunk.lineTo(x-23, y-219);
        trunk.lineTo(x-39, y-220);
        trunk.lineTo(x-23, y-219);
        trunk.lineTo(x-37, y-230);
        trunk.lineTo(x-23, y-219);
        trunk.lineTo(x-11, y-205);
        trunk.lineTo(x-5, y-220);
        trunk.lineTo(x-11, y-241);
        trunk.lineTo(x-5, y-220);
        trunk.lineTo(x+13, y-240);
        trunk.lineTo(x-5, y-220);
        trunk.lineTo(x-11, y-205);
        trunk.lineTo(x+2, y-159);
        trunk.lineTo(x+19, y-187);
        trunk.lineTo(x+18, y-225);
        trunk.lineTo(x+19, y-187);
        trunk.lineTo(x+28, y-211);
        trunk.lineTo(x+19, y-187);
        trunk.lineTo(x+43, y-210);
        trunk.lineTo(x+49, y-232);
        trunk.lineTo(x+43, y-210);
        trunk.lineTo(x+62, y-220);
        trunk.lineTo(x+43, y-210);
        trunk.lineTo(x+19, y-187);
        trunk.lineTo(x+2, y-159);
        trunk.lineTo(x+14, y-83);
        trunk.lineTo(x+51, y-193);
        trunk.lineTo(x+42, y-155);
        trunk.lineTo(x+84, y-184);
        trunk.lineTo(x+42, y-155);
        trunk.lineTo(x+70, y-172);
        trunk.lineTo(x+95, y-176);
        trunk.lineTo(x+70, y-172);
        trunk.lineTo(x+42, y-155);
        trunk.lineTo(x+19, y-74);
        trunk.lineTo(x+88, y-152);
        trunk.lineTo(x+24, y-58);
        trunk.lineTo(x+24, y);
        trunk.lineTo(x, y);
        
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(color);
        g2d.draw(trunk);
        g2d.fill(trunk);
        
        
        
    }
}
