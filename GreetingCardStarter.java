/**
 * The GreetingCardStarter class is the main class of the program that starts the GreetingCardFrame class. it also plays music in the program.
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

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class GreetingCardStarter {
     public static void main(String[] args) {
        playMusic("Phineas_And_Ferb_-_Summer_Where_Do_We_Begin_Lyrics_HD_+_HQ-NiI0HH3ye6Y.wav");// plays the music file stated in the paremeters
        GreetingCardFrame ef = new GreetingCardFrame("Summer-Espino,Joaquin-181877", 1024,768);
        ef.setupFrame();
        
    } 
     public static void playMusic(String filepath){ // This method plays the music stated un the GreetingCardStarter class.
     //source for applying music https://www.youtube.com/watch?v=3q4f6I5zi2w    
         InputStream music;
         try
         {
             music = new FileInputStream(new File(filepath));
             AudioStream audio = new AudioStream(music);
             AudioPlayer.player.start(audio);
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error");
         }
     }
}
