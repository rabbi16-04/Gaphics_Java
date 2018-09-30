package main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jframe {
	
	public static void main(String[] args) {
		
		JFrame ob = new JFrame("Fazley Rabbi");
		ob.setVisible(true);
		//ob.setrRirle("Title");
		ob.setBounds(100, 100, 400, 600);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton();
		button.setText("CLICK");
		ob.add(button);
	}

}
