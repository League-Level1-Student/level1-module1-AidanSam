package _07_binary_converter;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary {
	public void run() {

		
JFrame frame = new JFrame();
		frame.setTitle("Convert 8 digits of binary");
frame.setVisible(true);
	
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
JPanel panel = new JPanel();
	

	
	
frame.add(panel);

JButton button = new JButton();
	JTextField answer = new JTextField(20);
	button.setText("convert");
	button.addActionListener(null);
panel.add(answer);
panel.add(button);
frame.pack();
	String text= answer.getText();

		

		

	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();



	}
}
