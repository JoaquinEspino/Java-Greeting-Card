/**
 * The GreetingCardCanvas class creates a class that contains an array of DrawingObjects. It loops the objects so that they all use the method draw. 
 * It also contains an ActionListener that uses the methods of the classes that needs to move using the Timer object. 
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
import java.util.*;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
public class GreetingCardCanvas extends JComponent implements ActionListener{
    private ArrayList<DrawingObject> array;
    private boolean fontBol = true , fontBolS = true, fontBolA = true, fontBolW = true;
    Timer  tm = new Timer (20, this);/** creates the timer class that has an interval of 5 milliseconds . 
    Source in learning to use timer: http://www.java2s.com/Tutorial/Java/0240__Swing/Timerbasedanimation.htm**/
    public GreetingCardCanvas(){
        array = new ArrayList<>();
        //Winter background
        array.add(new Square(0, 0, 256, 768,new Color(123, 165, 248)));
        array.add(new Square(0, 700, 256, 68, new Color(255,250,250)));
        //Autumn background
        array.add(new Square(256, 0, 256, 768,new Color(162, 163, 3)));
        array.add(new Square(256, 700, 256, 68, new Color(218,165,32)));
        //Spring background
        array.add(new Square(512, 0, 256, 768,new Color(0, 255, 127)));
        array.add(new Square(512, 700, 256, 68, new Color(124, 252, 0)));
        //Summer background
        array.add(new Square(768, 0, 256, 768,new Color(202,238,249)));
        array.add(new Square(768, 700, 256, 68, new Color(249, 209, 153)));
        //Sun
        array.add(new Sun (974, -50, 100, new Color(255, 170, 0),new Color(255, 195, 77)));
        //Winter Trunk
        array.add(new Trunk(120, 720, new Color(160, 82, 45)));
        //Autumm Trunk
        array.add(new Trunk(376, 720, new Color(160, 82, 45)));
        //Spring Trunk
        array.add(new Trunk(632, 720, new Color(160, 82, 45)));
        //Summer Trunk
        array.add(new Trunk(888, 720, new Color(160, 82, 45)));
        //Summer Leaves
        array.add(new Leaves(968, 600, Color.GREEN));
        //Spring Leaves
        array.add(new Leaves(712, 600, new Color(255, 183, 197)));
        //Autumn Leaves
        array.add(new Leaves(456, 600, new Color(218, 120, 27)));
        //Falling Autumn Leaves
        array.add(new Leaf(440, 650, new Color(218, 120, 27)));
        array.add(new Leaf(456, 700, new Color(218, 120, 27)));
        array.add(new Leaf(300, 680, new Color(218, 120, 27)));
        array.add(new Leaf(356, 710, new Color(218, 120, 27)));
        array.add(new Leaf(330, 650, new Color(218, 120, 27)));
        //Winter Snow
        array.add(new Snow(50, 50, 10, Color.WHITE));
        array.add(new Snow(123, 400, 10, Color.WHITE));
        array.add(new Snow(90, 90, 10, Color.WHITE));
        array.add(new Snow(100, 340, 10, Color.WHITE));
        array.add(new Snow(200, 200, 10, Color.WHITE));
        array.add(new Snow(140, 100, 10, Color.WHITE));
        array.add(new Snow(80, 200, 10, Color.WHITE));
        array.add(new Snow(60, 250, 10, Color.WHITE));
        array.add(new Snow(210, 250, 10, Color.WHITE));
        //Summer Clouds
        array.add(new Cloud(800, 20, 50, Color.WHITE));
        array.add(new Cloud(850, 120, 50, Color.WHITE));
        //Summer Birds
        array.add(new Bird(800, 100, 20,  new Color(64,224,208), new Color(224,255,255)));
        array.add(new Bird(900, 70, 30,  new Color(218,165,32), new Color(204,204,0)));
        //Beach ball
        array.add(new BeachBall(800, 710, 40));
        //Spring Flowers
        array.add(new Flowers(570, 720, 10, new Color(255, 183, 197)));
        array.add(new Flowers(610, 740, 10, new Color(255, 183, 197)));
        array.add(new Flowers(670, 720, 10, new Color(255, 183, 197)));
        array.add(new Flowers(720, 730, 10, new Color(255, 183, 197)));
        array.add(new Flowers(570, 520, 10, new Color(255, 183, 197)));
        array.add(new Flowers(610, 500, 10, new Color(255, 183, 197)));
        array.add(new Flowers(670, 530, 10, new Color(255, 183, 197)));
        array.add(new Flowers(720, 540, 10, new Color(255, 183, 197)));
        //More Winter Snow
        array.add(new Snow(123, 0, 10, Color.WHITE));
        array.add(new Snow(90, -310, 10, Color.WHITE));
        array.add(new Snow(100, -60, 10, Color.WHITE));
        array.add(new Snow(200, -200, 10, Color.WHITE));
        array.add(new Snow(140, -300, 10, Color.WHITE));
        array.add(new Snow(80, -200, 10, Color.WHITE));
        array.add(new Snow(60, -250, 10, Color.WHITE));
        array.add(new Snow(210, -250, 10, Color.WHITE));
        //The displayed text
        array.add(new Fonts());
        //Spring Clouds
        array.add(new Cloud(544, 20, 50, new Color(239,238,237)));
        array.add(new Cloud(594, 120, 50, new Color(239,238,237)));
        //Autumn Clouds
        array.add(new Cloud(288, 20, 50, new Color(224,223,221)));
        array.add(new Cloud(338, 120, 50, new Color(224,223,221)));
        //Winter Clouds
        array.add(new Cloud(32, 20, 50, new Color(168,167,165)));
        array.add(new Cloud(82, 120, 50, new Color(168,167,165)));
        //Autumn Flowers
        array.add(new AutumnLeaf(314, 720, 20, new Color(176, 101, 75)));
        array.add(new AutumnLeaf(354, 740, 20, new Color(176, 101, 75)));
        array.add(new AutumnLeaf(414, 720, 20, new Color(176, 101, 75)));
        array.add(new AutumnLeaf(464, 730, 20, new Color(176, 101, 75)));
        setPreferredSize(new Dimension(1024, 768));
         
    }
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            for(DrawingObject drawing : array) { // creates the loop of the DrawingComponents ArrayList and calls the method draw() .
                RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setRenderingHints(rh);
                drawing.draw(g2d);
                tm.start();
            }
        }
        
        public void actionPerformed(ActionEvent ae ){// performs all the movements of the different objects in the ArrayList
            //moves the leaves
            Leaves leaves = (Leaves) array.get(13);
            leaves.rotateleafmore(1);
            Leaves leaves2 = (Leaves) array.get(14);
            leaves2.rotateleafmore(1);
            Leaves leaves3 = (Leaves) array.get(15);
            leaves3.rotateleafmore(1);
            //drops the Autumn leaves
            Leaf leaf = (Leaf) array.get(16);
            leaf.dropleaf(1);
            Leaf leaf2 = (Leaf) array.get(17);
            leaf2.dropleaf(1);
            Leaf leaf3 = (Leaf) array.get(18);
            leaf3.dropleaf(1);
            Leaf leaf4 = (Leaf) array.get(19);
            leaf4.dropleaf(1);
            Leaf leaf5 = (Leaf) array.get(20);
            leaf5.dropleaf(1);
            //Spins the Flowers
            Flowers flower = (Flowers) array.get(35);
            flower.FlowerSpin(1);
            Flowers flower2 = (Flowers) array.get(36);
            flower2.FlowerSpin(1);
            Flowers flower3 = (Flowers) array.get(37);
            flower3.FlowerSpin(1);
            Flowers flower4 = (Flowers) array.get(38);
            flower4.FlowerSpin(1);
            Flowers flower5 = (Flowers) array.get(39);
            flower5.FlowerSpin(1);
            Flowers flower6 = (Flowers) array.get(40);
            flower6.FlowerSpin(1);
            Flowers flower7 = (Flowers) array.get(41);
            flower7.FlowerSpin(1);
            Flowers flower8 = (Flowers) array.get(42);
            flower8.FlowerSpin(1);
            // makes the snow fall in a loop
            Snow snow = (Snow) array.get(21);
            snow.Falling(2);
            Snow snow1 = (Snow) array.get(22);
            snow1.Falling(2);
            Snow snow2 = (Snow) array.get(23);
            snow2.Falling(2);
            Snow snow3 = (Snow) array.get(24);
            snow3.Falling(2);
            Snow snow4 = (Snow) array.get(25);
            snow4.Falling(2);
            Snow snow5 = (Snow) array.get(26);
            snow5.Falling(2);
            Snow snow6 = (Snow) array.get(27);
            snow6.Falling(2);
            Snow snow7 = (Snow) array.get(28);
            snow7.Falling(2);
            Snow snow8 = (Snow) array.get(29);
            snow8.Falling(2);
            Snow snow9 = (Snow) array.get(43);
            snow9.Falling(2);
            Snow snow10 = (Snow) array.get(44);
            snow10.Falling(2);
            Snow snow11 = (Snow) array.get(45);
            snow11.Falling(2);
            Snow snow12 = (Snow) array.get(46);
            snow12.Falling(2);
            Snow snow13 = (Snow) array.get(47);
            snow13.Falling(2);
            Snow snow14 = (Snow) array.get(48);
            snow14.Falling(2);
            Snow snow15 = (Snow) array.get(49);
            snow15.Falling(2);
            Snow snow16 = (Snow) array.get(50);
            snow16.Falling(2);
            //rotates the rays of the sun
            Sun sun  = (Sun) array.get(8);
            sun.spinRay(1);
            //moves the beach ball
            BeachBall beachball = (BeachBall) array.get(34);
            beachball.rotateandmove(2);
            //moves the bird down and up
            Bird bird = (Bird) array.get(33);
            bird.dropbird(1);
            //moves the bird up and down
            Bird bird1 = (Bird) array.get(32);
            bird1.upbird(1);
            // moves the cloud side to side
            Cloud cloud1 = (Cloud) array.get(30);
            cloud1.moveCloud(.5);
            Cloud cloud2 = (Cloud) array.get(31);
            cloud2.moveCloud(.5);
            Cloud cloud3 = (Cloud) array.get(52);
            cloud3.moveCloud(.5);
            Cloud cloud4 = (Cloud) array.get(53);
            cloud4.moveCloud(.5);
            Cloud cloud5 = (Cloud) array.get(54);
            cloud5.moveCloud(.5);
            Cloud cloud6 = (Cloud) array.get(55);
            cloud6.moveCloud(.5);
            Cloud cloud7 = (Cloud) array.get(56);
            cloud7.moveCloud(.5);
            Cloud cloud8 = (Cloud) array.get(57);
            cloud8.moveCloud(.5);
            //spins the autumn flowers
            AutumnLeaf leafA1 = (AutumnLeaf) array.get(58);
            leafA1.AutumnSpin(1);
            AutumnLeaf leafA2 = (AutumnLeaf) array.get(59);
            leafA2.AutumnSpin(1);
            AutumnLeaf leafA3 = (AutumnLeaf) array.get(60);
            leafA3.AutumnSpin(1);
            AutumnLeaf leafA4 = (AutumnLeaf) array.get(61);
            leafA4.AutumnSpin(1);
            //displays "Pick a Tree"
            Fonts font1 = (Fonts) array.get(51);
            font1.defaultText(5);
            //the conditions on what text to pick on specific MouseListeners
            if(fontBol == false){
            Fonts font = (Fonts) array.get(51);
            font.appear(5);   
            
            }
            if(fontBolS == false){
            Fonts font = (Fonts) array.get(51);
            font.appearSpring(5);  
            
            }
            if(fontBolA == false){
            Fonts font = (Fonts) array.get(51);
            font.appearAutumn(5);   
            
            }
            if(fontBolW == false){
            Fonts font = (Fonts) array.get(51);
            font.appearWinter(5);  
            
            }
            repaint();
            
            
        }
        
        
        public void GetFont (){//causes the action listener to display the summer text
            fontBol = false;
            fontBolS = true;
            fontBolA = true;
            fontBolW = true;
        }
        public void GetFontS (){//causes the action listener to display the spring text
            fontBolS = false;
            fontBol = true;
            fontBolA = true;
            fontBolW = true;
        }
        public void GetFontA (){//causes the action listener to display the Autumn text
            fontBolA = false;
            fontBolS = true;
            fontBol = true;
            fontBolW = true;
        }
        public void GetFontW (){//Causes the action listener to display the Winter text
            fontBolW = false;
            fontBolS = true;
            fontBolA = true;
            fontBol = true;
        }
        
   
    

    
    
    
    
}
