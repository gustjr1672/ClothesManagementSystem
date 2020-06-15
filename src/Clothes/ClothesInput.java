package Clothes;

import java.util.Scanner;

import exception.TotallengthFormatException;

public interface ClothesInput {
	
	public String getType();
	
	public void setType(String type);
	
	public void setColor(String color);
	
	public String getColor();
	
	public void setTotallength (String totallength) throws TotallengthFormatException;
	
	public String getTotallength();
	
	public void setPrice(String price);
	
	public String getPrice();
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setClothesType( Scanner input);
	
	public void setClothesColor( Scanner input);
	
	public void setClothesTotallength( Scanner input);
	
	public void setClothesPrice( Scanner input);

	
}
