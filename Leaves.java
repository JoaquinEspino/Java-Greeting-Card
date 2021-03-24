
/**
 * The Leaves class creates a 2d object and it implements the DrawingObject interface. It uses the Leaf class to form a bunch of leaves.
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
public class Leaves implements DrawingObject{
    private double x;
    private double y;
    private Color color;
    private double r;
    private boolean bol;
    
    public Leaves(double x, double y, Color c){
        this.x = x;
        this.y = y;
        color = c;
        r = 0;
        bol = true;
    }
    
    public void draw(Graphics2D g2d){ //draws 30 Leaf objects
     
       Leaf leaf1 = new Leaf(x, y, color);
       AffineTransform reset = g2d.getTransform();
       leaf1.rotateleaf(r);
       leaf1.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf2 = new Leaf(x+15, y+10, color);
       leaf2.rotateleaf(r+15);
       leaf2.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf3 = new Leaf(x-15, y-10, color);
       leaf3.rotateleaf(r+25);
       leaf3.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf4 = new Leaf(x-35, y-20, color);
       leaf4.rotateleaf(r+65);
       leaf4.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf5 = new Leaf(x-55, y-50, color);
       leaf5.rotateleaf(r+85);
       leaf5.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf6 = new Leaf(x-75, y-60, color);
       leaf6.rotateleaf(r+125);
       leaf6.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf7 = new Leaf(x-115, y-110, color);
       leaf7.rotateleaf(r+25);
       leaf7.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf8 = new Leaf(x-135, y-90, color);
       leaf8.rotateleaf(r+25);
       leaf8.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf9 = new Leaf(x-155, y-50, color);
       leaf9.rotateleaf(r+95);
       leaf9.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf10 = new Leaf(x-170, y-30, color);
       leaf10.rotateleaf(r+120);
       leaf10.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf11 = new Leaf(x-100, y-40, color);
       leaf11.rotateleaf(r+30);
       leaf11.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf12 = new Leaf(x-150, y+30, color);
       leaf12.rotateleaf(r+160);
       leaf12.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf13 = new Leaf(x-50, y-100, color);
       leaf13.rotateleaf(r+100);
       leaf13.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf14 = new Leaf(x-30, y-80, color);
       leaf14.rotateleaf(r+45);
       leaf14.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf15 = new Leaf(x-10, y-50, color);
       leaf15.rotateleaf(r+75);
       leaf15.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf16 = new Leaf(x-20, y-60, color);
       leaf16.rotateleaf(r+(-75));
       leaf16.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf17 = new Leaf(x-40, y-90, color);
       leaf17.rotateleaf(r+115);
       leaf17.draw(g2d);
       g2d.setTransform(reset);
       g2d.setTransform(reset);
       Leaf leaf18 = new Leaf(x-100, y-100, color);
       leaf18.rotateleaf(r+215);
       leaf18.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf19 = new Leaf(x-90, y-80, color);
       leaf19.rotateleaf(r+15);
       leaf19.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf20 = new Leaf(x-90, y-50, color);
       leaf20.rotateleaf(r+77);
       leaf20.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf21 = new Leaf(x-70, y-70, color);
       leaf21.rotateleaf(r+107);
       leaf21.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf22 = new Leaf(x-130, y-30, color);
       leaf22.rotateleaf(r+77);
       leaf22.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf23 = new Leaf(x-130, y, color);
       leaf23.rotateleaf(r+170);
       leaf23.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf24 = new Leaf(x-120, y-70, color);
       leaf24.rotateleaf(r+170);
       leaf24.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf25 = new Leaf(x+10, y-30, color);
       leaf25.rotateleaf(r+170);
       leaf25.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf26 = new Leaf(x-50, y-30, color);
       leaf26.rotateleaf(r+50);
       leaf26.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf27 = new Leaf(x-20, y-30, color);
       leaf27.rotateleaf(r+30);
       leaf27.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf28 = new Leaf(x-90, y-30, color);
       leaf28.rotateleaf(r+30);
       leaf28.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf29 = new Leaf(x-120, y-50, color);
       leaf29.rotateleaf(r+50);
       leaf29.draw(g2d);
       g2d.setTransform(reset);
       Leaf leaf30 = new Leaf(x-150, y-10, color);
       leaf30.rotateleaf(r+50);
       leaf30.draw(g2d);
       g2d.setTransform(reset);
         
    }
    
    public void rotateleafmore(double distance){ // moves the Leaves object back and forth.
        
            if(bol == true){
            r += distance;
            if(r>=90){
                bol = false;
               }
            }
            else if(bol==false){
                r -= distance;
                if(r<=0){
                bol = true;
                }
            }
            
            
        
      
        }
        
    
}
