package Clothes;

import java.util.Scanner;

public class SummerClothes extends LongClothes {

	public SummerClothes(ClothesKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setClothesType(input);
		setClothesColor(input);
		setClothesTotallengthwithYN(input);
		setClothesPrice(input);
	}
}
