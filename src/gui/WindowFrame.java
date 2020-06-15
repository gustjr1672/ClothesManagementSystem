package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Manager.ClothesManager;

public class WindowFrame extends JFrame{
	
	ClothesManager clothesManager;
	
	MenuSelection menuselection;
	ClothesAdder clothesadder;
	ClothesViewer clothesviewer;
	

	public WindowFrame(ClothesManager clothesManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MY Frame");
		
		this.clothesManager = clothesManager;
		this.menuselection = new MenuSelection(this);
		this.clothesadder = new ClothesAdder(this);
		this.clothesviewer = new ClothesViewer(this, this.clothesManager);
		
	
		this.add(menuselection);

		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}


	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}


	public ClothesAdder getClothesadder() {
		return clothesadder;
	}


	public void setClothesadder(ClothesAdder clothesadder) {
		this.clothesadder = clothesadder;
	}


	public ClothesViewer getClothesviewer() {
		return clothesviewer;
	}


	public void setClothesviewer(ClothesViewer clothesviewer) {
		this.clothesviewer = clothesviewer;
	}

}