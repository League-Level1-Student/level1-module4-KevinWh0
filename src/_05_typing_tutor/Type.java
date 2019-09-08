package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Type implements KeyListener {
	
	char currentLetter = generateRandomLetter();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char keyPressed;
	int score = 0;
	void typeMain() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(label);
		
		
		label.setText("Type: "+currentLetter);
		//JLabel.setFont(JLabel.getFont().deriveFont(28.0f));
		//JLabel.setHorizontalAlignment(JLabel.CENTER);
		frame.pack();
		frame.addKeyListener(this);
		if(keyPressed == currentLetter) {
			score++;
			
		}
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		keyPressed = e.getKeyChar();
		if(keyPressed == currentLetter) {
			System.out.println(keyPressed);
		}else {
			System.err.println(keyPressed);
		}
		currentLetter = generateRandomLetter();

		label.setText("Type: "+currentLetter);

	}
}
