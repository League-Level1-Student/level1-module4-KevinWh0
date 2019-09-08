package _01_nasty_surprise;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	Frame frame1 = new JFrame();
	JPanel panel = new JPanel();
	JButton trick = new JButton("Trick");
	JButton treat = new JButton("Treat");
	void trickOrTreat() {
		
		
		
		frame1.setVisible(true);
		((JFrame) frame1).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame1.add(treat);
		frame1.add(panel);
		panel.add(trick);
		panel.add(treat);
		treat.addActionListener(this);
		trick.addActionListener(this);
		frame1.pack();
		//treat.setSize(55, 55); 
		//trick.setSize(65, 35);

		//frame.pack();
		//puppies
		//this.showPictureFromTheInternet("https://dogtime.com/assets/uploads/2010/12/puppies-1280x720.jpg");
		
	
		//treat.setBounds(10,10,10,10);
		//trick.setBounds(0,0,10, 10);
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(trick)) {
			this.showPictureFromTheInternet("https://dogtime.com/assets/uploads/2010/12/puppies-1280x720.jpg");

		}else if(e.getSource().equals(treat)) {
			this.showPictureFromTheInternet("https://miro.medium.com/max/4408/1*8xlDbPkdc9I_XC6HJA4IzQ.jpeg");

		}
		frame1.dispose();
	}
}
