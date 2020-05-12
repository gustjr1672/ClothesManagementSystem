package Clothes;

import java.util.Scanner;

public interface ClothesInput {
	
	public String getType();
	
	public void setType(String type);
	
	public void setColor(String color);
	
	public void setTotallength(String totallength);
	
	public void setPrice(String price);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setClothesType( Scanner input);
	
	public void setClothesColor( Scanner input);
	
	public void setClothesTotallength( Scanner input);
	
	public void setClothesPrice( Scanner input);
}
