/**
 * The GretingCardFrame class creates the JFrame of the program. The JFrame consists of a JLayeredPane that consists of the GreetingCardCanvas. 
 * It contains the JPanels that have MouseListeners. It also contains the MouseListeners themselves attached to the JPanels.
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
import java.awt.event.*;
import java.util.ArrayList;
public class GreetingCardFrame extends JFrame{
    private int width;
    private int height;
    private String title;
    private JPanel clicked, clickedSpring, clickedAutumn, clickedWinter;
    private JLayeredPane pane;
    private GreetingCardCanvas GC;
    public GreetingCardFrame (String t, int  w, int h){
        title = t;
        width = w;
        height = h;
        
        
    }
    
    public void setupFrame(){// This method sets up the  JFrame.
        setTitle(title);
        pane = new JLayeredPane();
        add(pane, BorderLayout.CENTER); /* Uses a JLayeredPane named pane to add to the frame. Source for learning JLayeredPane: Alysha Columbres
        Use JLayeredPane to layer your components to produce a clickable JPalen above the GreetingCarCanvas object*/
        GC = new GreetingCardCanvas();
        Dimension cardCarnvasSize = GC.getPreferredSize();
        GC.setBounds(0, 0, width, height);// Adds the GreetingCardCanvas object at the lowest layer of your JLayeredPane
        pane.add(GC, 0,0);
        
        //created an invisible JPanel named clicked
        clicked = new JPanel();
        clicked.setBackground(new Color(0, 0, 0, 0));
        //adds the MouseListener named name to clicked.
        clicked.addMouseListener( name );
        Dimension clickedSize = clicked.getPreferredSize();
        clicked.setBounds(798, 469, 200, 250);
        pane.add(clicked, 1, 0);//puts clicked in pane
        //created an invisible JPanel named clickedSpring
        clickedSpring = new JPanel();
        clickedSpring.setBackground(new Color(0, 0, 0, 0));
        //adds the MouseListener namedS name to clickedSpring.
        clickedSpring.addMouseListener( nameS );
        Dimension clickedSizeSpring = clickedSpring.getPreferredSize();
        clickedSpring.setBounds(543, 469, 200, 250);
        pane.add(clickedSpring, 1, 0);//puts clicked in pane
        //created an invisible JPanel namedSpring clickdAutumn
        clickedAutumn = new JPanel();
        clickedAutumn.setBackground(new Color(0, 0, 0, 0));
        //adds the MouseListener named nameA to clickedAutumn.
        clickedAutumn.addMouseListener( nameA );
        Dimension clickedSizeAutumn = clickedAutumn.getPreferredSize();
        clickedAutumn.setBounds(288, 469, 200, 250);
        pane.add(clickedAutumn, 1, 0);//puts clickedAutumn in pane
        //created an invisible JPanel named clickedWinter
        clickedWinter = new JPanel();
        clickedWinter.setBackground(new Color(0, 0, 0, 0));
        //adds the MouseListener named nameW to clickedWinter.
        clickedWinter.addMouseListener( nameW );
        Dimension clickedSizeWinter = clickedWinter.getPreferredSize();
        clickedWinter.setBounds(33, 469, 200, 250);
        pane.add(clickedWinter, 1, 0);//puts clickedWinter in pane
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setPreferredSize(new Dimension(1024, 768));
        pack();
        setVisible(true);        
        
    }
    
    MouseListener name = new MouseListener() { // creates a MotionLister named name. Source for learning MouseListeners: Alysha Columbres
        public void mouseClicked( MouseEvent me )
        {
        GC.GetFont();//Makes the displayed text "Happy Summer"
        
        }
        
        public void mouseExited( MouseEvent me ) {}
        public void mousePressed( MouseEvent me ) {}
        public void mouseEntered( MouseEvent me ) {}
        public void mouseReleased( MouseEvent me ) {}
    };
    MouseListener nameS = new MouseListener() {// creates a MotionLister namedS name
        public void mouseClicked( MouseEvent me )
        {
        GC.GetFontS();//Makes the displayed text "Spring Awakening"
        
        }
        
        public void mouseExited( MouseEvent me ) {}
        public void mousePressed( MouseEvent me ) {}
        public void mouseEntered( MouseEvent me ) {}
        public void mouseReleased( MouseEvent me ) {}
    };
    MouseListener nameA = new MouseListener() {// creates a MotionLister namedA name
        public void mouseClicked( MouseEvent me )
        {
        GC.GetFontA();//Makes the displayed text "Gloomy Autumn"
        
        }
        
        public void mouseExited( MouseEvent me ) {}
        public void mousePressed( MouseEvent me ) {}
        public void mouseEntered( MouseEvent me ) {}
        public void mouseReleased( MouseEvent me ) {}
    };
    MouseListener nameW = new MouseListener() {// creates a MotionLister namedW name
        public void mouseClicked( MouseEvent me )
        {
        GC.GetFontW();//Makes the displayed text " Cold Winter"
        
        }
        
        public void mouseExited( MouseEvent me ) {}
        public void mousePressed( MouseEvent me ) {}
        public void mouseEntered( MouseEvent me ) {}
        public void mouseReleased( MouseEvent me ) {}
    };
    
}
