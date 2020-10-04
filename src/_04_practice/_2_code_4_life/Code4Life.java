package _04_practice._2_code_4_life;

import java.applet.AudioClip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Code4Life {
public static void main(String[] args) {
	

	// 1. Ask the user how many hours they spent coding this week.
String hours = JOptionPane.showInputDialog("How many hours did you spend coding this week? (number form only)");
int hours2 = Integer.parseInt(hours);{
	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.
if(hours2<=2) {
	JOptionPane.showMessageDialog(null, "Stop watching Youtube and write code.");
}


	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja
if(hours2>=3&&hours2<=5) { 
JOptionPane.showMessageDialog(null, "You are a Code Ninja");

}

	// 4. If it is more than 5, call the method below to play the Batman theme song.
if(hours2>=5) {
	playBatmanTheme();
}//listening to music!!!!! <–– ye
}   //how do you put it in after you've downloaded it them? 
//drag what.. um 
	// NOTE: You may have to get batman.wav from league-sounds on github: https://github.com/jointheleague/league-sounds
}
	private static void playBatmanTheme() {
		try {
			AudioClip sound = JApplet.newAudioClip(Code4Life.class.getResource("batman.wav"));
			sound.play();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

