package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClothesViewer extends JPanel {
	WindowFrame Frame;

	public ClothesViewer(WindowFrame frame) {
		this.Frame =frame;

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Type");
		model.addColumn("Color");
		model.addColumn("Totallength");
		model.addColumn("Price");

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}
}
