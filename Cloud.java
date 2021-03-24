/**
 * The Cloud class creates 2d ellipse objects shaped into a cloud. It also implements the DrawingObject interface.
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
public class Cloud implements DrawingObject{
    private double x;
    private double y;
    private double size;
    private Color color;
    private double rm;
    private boolean bol;
    public Cloud(double x, double y, double size, Color color ){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        rm = 0;
        bol = true;
    }
    public void draw(Graphics2D g2d){
        Ellipse2D.Double ellipse1 = new Ellipse2D.Double(rm+x,y,size,size);
        Ellipse2D.Double ellipse2 = new Ellipse2D.Double(rm+x+size*.5,y-size*.3,size*1.5,size*1.5);
        Ellipse2D.Double ellipse3 = new Ellipse2D.Double(rm+x+size*1.5,y+size*.1,size*1.1,size*1.1);
        Ellipse2D.Double ellipse4 = new Ellipse2D.Double(rm+x+size*2,y+size*.05,size*.5,size*.5);
        g2d.setColor(color);
        g2d.fill(ellipse1);
        g2d.fill(ellipse2);
        g2d.fill(ellipse3);
        g2d.fill(ellipse4);
    }
    
    public void moveCloud(double distance){ //This method moves the clouds left and right by 30 pixels.
        if(bol == true){
            rm += distance;
            if(rm==30){
                bol = false;
               }
            }
            else if(bol==false){
                rm -= distance;
                if(rm==0){
                bol = true;
                }
            }
    }
    
}
