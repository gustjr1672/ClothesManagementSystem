package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Clothes.ClothesInput;
import Manager.ClothesManager;

public class ClothesViewer extends JPanel {
	WindowFrame Frame;
	
	ClothesManager clothesManager;

	public ClothesViewer(WindowFrame frame, ClothesManager clothesManager) {
		this.Frame =frame;
		this.clothesManager = clothesManager;
		
		System.out.println("***" + clothesManager.size());
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Type");
		model.addColumn("Color");
		model.addColumn("Totallength");
		model.addColumn("Price");
		
		for(int i=0; i< clothesManager.size(); i++) {
			Vector row = new Vector();
			ClothesInput ci = clothesManager.get(i);
			row.add(ci.getType());
			row.add(ci.getColor());
			row.add(ci.getTotallength());
			row.add(ci.getPrice());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}
}
