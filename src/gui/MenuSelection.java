package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {
	
	public MenuSelection() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		JPanel pane2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		
		JButton button1 = new JButton("Add Clothes");
		JButton button2 = new JButton("View Clothes");
		JButton button3 = new JButton("Edit Clothes");
		JButton button4 = new JButton("Delet Clothes");
		JButton button5 = new JButton("Exit Program");
		
		panel1.add(label);
		pane2.add(button1);
		pane2.add(button2);
		pane2.add(button3);
		pane2.add(button4);
		pane2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(pane2, BorderLayout.CENTER);
		
		this.setVisible(true);
	}

}
