package Clothes;

import java.io.Serializable;
import java.util.Scanner;

import exception.TotallengthFormatException;

public abstract class Clothes implements ClothesInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -358471720352873275L;
	protected ClothesKind kind = ClothesKind.SpringClothes;
	protected String type;
	protected String color;
	protected String totallength;
	protected String price; 

	public Clothes() {
	}

	public Clothes(ClothesKind kind) {
		this.kind = kind;
	}

	public Clothes(	String type, String color){	
		this.type = type;
		this.color = color;
	}

	public Clothes(	String type, String color, String totallength, String price)
	{	
		this.type = type;
		this.color = color;
		this.totallength = totallength;
		this.price = price;
	}

	public Clothes( ClothesKind kind, String type, String color, String totallength, String price)
	{	
		this.kind = kind;
		this.type = type;
		this.color = color;
		this.totallength = totallength;
		this.price = price;
	}

	public ClothesKind getKind() {
		return kind;
	}

	public void setKind(ClothesKind kind) {
		this.kind = kind;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTotallength() {
		return totallength;
	}

	public void setTotallength(String totallength) throws TotallengthFormatException {
		if(!totallength.contains("cm") && !totallength.equals("")) {
			throw new TotallengthFormatException();
		}
		this.totallength = totallength;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public abstract void printInfo();

	public void setClothesType( Scanner input) {
		System.out.print("clothes type:");
		String type = input.next();
		this.setType(type);
	}

	public void setClothesColor(Scanner input) {
		System.out.print("clothes color:");
		String color = input.next();
		this.setColor(color);
	}

	public void setClothesTotallength( Scanner input) {
		String totallength = "";
		while(!totallength.contains("cm")) {
			System.out.print("clothes totallength:");
			totallength = input.next();
			try {
				this.setTotallength(totallength);
			} catch (TotallengthFormatException e) {
				System.out.println("please enter length units 'cm'.");
			}
		}
	}

	public void setClothesPrice( Scanner input) {
		System.out.print("clothes price:");
		String price = input.next();
		this.setPrice(price);
	}

	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case SpringClothes:
			skind = "Spring";
			break;
		case SummerClothes:
			skind = "Summer";
			break;
		case FallClothes:
			skind = "Fall";
			break;
		case WinterClothes:
			skind = "Winter";
			break;
		default:
		}
		return skind;
	}
}


