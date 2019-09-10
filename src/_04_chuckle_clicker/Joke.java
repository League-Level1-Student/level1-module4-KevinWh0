package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Joke implements ActionListener {
	
	JFrame frame = new JFrame("MEME Gen");
	JPanel panel = new JPanel();
	JButton joke = this.makeButtons("Joke");
	JButton punchline = this.makeButtons("Punchline");
	void buttons() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		joke.addActionListener(this);
		punchline.addActionListener(this);
		panel.add(joke);
		panel.add(punchline);
		frame.pack();
	}
	
	JButton makeButtons(String Name) {
		JButton button = new JButton(Name);
		
		
		
		return button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == joke) {
			joke.setText("I invented a new word!");
		
		}else {
			punchline.setText("Plagiarism.");
			
		}
		frame.pack();

	}
}
