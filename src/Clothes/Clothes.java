package Clothes;

import java.util.Scanner;

public class Clothes {
	
	protected ClothesKind kind = ClothesKind.SpringClothes;
	protected String type;
	protected String color;
	protected String totallength;
	protected String price; 

	public Clothes() {
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

	public void setTotallength(String totallength) {
		this.totallength = totallength;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public void printInfo() {
		System.out.println("type:" + type +   " color:" + color + " totallength:" + totallength + " price:" + price);
	}
	public void getUserInput(Scanner input) {
		System.out.print("clothes type:");
		String type = input.next();
		this.setType(type);
		
		System.out.print("clothes color:");
		String color = input.next();
		this.setColor(color);
		
		System.out.print("clothes totallength:");
		String totallength = input.next();
		this.setTotallength(totallength);
		
		System.out.print("clothes price:");
		String price = input.next();
		this.setPrice(price);
	}
}


