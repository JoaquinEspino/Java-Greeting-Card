/**
 * The Fonts class creates a Font object that creates the different texts displayed using the MouseListeners.  It implements the DrawingObject interface.
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
import java.awt.event.*;
public class Fonts implements DrawingObject{

    private Font message;
    private String string;
    private int x;
    private Color color;
    public Fonts(){
        string = "";
        message = new Font("Courier", Font.BOLD, 100 );// creates a Font object with the font Courier and in bold)
        x = 0;
    }
    
    public void draw(Graphics2D g2d) {//creates the text
          g2d.setColor(color);
          g2d.setFont(message);
          g2d.drawString(string, x, 350);
          
          
    }
    
    
    public void defaultText(double distance){//method that makes the set font to "Pick a tree"
        string = "Pick a Tree";
        color = Color.WHITE;
        x += distance;
        if(x==1100){
            x = -1100;
            
        }
        
    }
    public void appear(double distance){//method that makes the set font to "HAPPY SUMMER"
        string = "HAPPY SUMMER";
        color = new Color(250, 250, 250);
        x += distance;
        if(x==1100){
            x = -1100;
        }
    }
    public void appearSpring(double distance){//method that makes the set font to "SPRING AWAKENING"
        string = "SPRING AWAKENING";
        color = new Color(255, 183, 197);
        x += distance;
        if(x==1100){
            x = -1100;
        }
    }
    public void appearAutumn(double distance){//method that makes the set font to "GLOOMY AUTUMN"
        string = "GLOOMY AUTUMN";
        color = new Color(218, 120, 27);
        x += distance;
        if(x==1100){
            x = -1100;
        }
    }
    public void appearWinter(double distance){//method that makes the set font to "COLD WINTER"
        string = "COLD WINTER";
        color = new Color(204, 255, 255);
        x += distance;
        if(x==1100){
            x = -1100;
        }
    }
    
    
    
    
}