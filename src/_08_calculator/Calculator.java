package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField field1 = new JTextField(12);
	JTextField field2 = new JTextField(12);
	
	JButton addButton = new JButton("+");
	JButton subtractButton = new JButton("-");
	JButton multButton = new JButton("X");
	JButton divButton = new JButton("\u00F7");
	
	JLabel ans = new JLabel();
	
	float num1;
	float num2;
	String input1 = "0.0";
	String input2 = "0.0";
	
	String mathType;

	public void displayCalc() {
		frame.setPreferredSize(new Dimension(350,250));
		
		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.add(field1);
		panel.add(field2);

		
		panel.add(addButton);
		panel.add(subtractButton);
		panel.add(multButton);
		panel.add(divButton);
		panel.add(ans);
		
		
		addButton.addActionListener(this);
		subtractButton.addActionListener(this);
		multButton.addActionListener(this);
		divButton.addActionListener(this);

		//this.doMath();

		
		frame.pack();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		input1 = field1.getText();
		input2 = field2.getText();
		try {
			num1 = Float.parseFloat(input1);
			num2 = Float.parseFloat(input2);
	
			if(e.getSource() == addButton) {
				ans.setText(num1+num2+" ");
				
				
			}else if(e.getSource() == subtractButton) {
				ans.setText(num1-num2+" ");
			}else if(e.getSource() == multButton) {
				ans.setText(num1*num2+" ");
			}else if(e.getSource() == divButton) {
				ans.setText(num1/num2+" ");
			}
		}catch(Exception e1) {
			ans.setText("Thats not a Number + \n Catastrophic failure \n" + e1);
		}
		
	}

}
