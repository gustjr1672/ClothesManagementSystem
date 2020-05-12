package Clothes;

import java.util.Scanner;

public class SpringClothes extends Clothes {
	
	public SpringClothes(ClothesKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setClothesType(input);
		setClothesColor(input);
		setClothesTotallength(input);
		setClothesPrice(input);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind +"type:" + type +   " color:" + color + " totallength:" + totallength + " price:" + price);
	}
}
