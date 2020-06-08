package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ClothesAdder extends JPanel{
	WindowFrame Frame;
	
	public ClothesAdder(WindowFrame frame) {
		this.Frame =frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelType = new JLabel("Type: ", JLabel.TRAILING);
		JTextField filedType = new JTextField(10);
		labelType.setLabelFor(filedType);
		panel.add(labelType);
		panel.add(filedType);

		JLabel labelColor = new JLabel("Color: ", JLabel.TRAILING);
		JTextField filedColor = new JTextField(10);
		labelType.setLabelFor(filedColor);
		panel.add(labelColor);
		panel.add(filedColor);

		JLabel labelTotallength = new JLabel("Totallength: ", JLabel.TRAILING);
		JTextField filedTotallength = new JTextField(10);
		labelType.setLabelFor(filedTotallength);
		panel.add(labelTotallength);
		panel.add(filedTotallength);

		JLabel labelPrice = new JLabel("Price: ", JLabel.TRAILING);
		JTextField filedPrice = new JTextField(10);
		labelType.setLabelFor(filedPrice);
		panel.add(labelPrice);
		panel.add(filedPrice);

		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

		this.add(panel);
		this.setVisible(true);

	}
}
