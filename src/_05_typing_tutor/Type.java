package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Type {
	
	char currentLetter = generateRandomLetter();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	void typeMain() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(label);
		
		
		label.setText("Type: "+currentLetter);
		//JLabel.setFont(JLabel.getFont().deriveFont(28.0f));
		//JLabel.setHorizontalAlignment(JLabel.CENTER);
		frame.pack();
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
}
