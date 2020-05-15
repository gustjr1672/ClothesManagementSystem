package Clothes;

import java.util.Scanner;

import exception.TotallengthFormatException;

public class FallClothes extends LongClothes {

	protected String size;

	public FallClothes(ClothesKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setClothesType(input);
		setClothesColor(input);
		setClothesTotallengthwithYN(input);
		setClothesSizehwithYN(input);
		setClothesPrice(input);
	}

	public void setClothesSizehwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you know clothes size(L,M S)? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if(answer == 'y' || answer == 'Y') {
					System.out.print("clothes size of (L,M,S):");
					String size = input.next();
					this.size = size;
					break;
				}
				else if(answer == 'n' || answer == 'N') {
					this.setTotallength("");
					break;
				}
				else {
				}
			}catch(TotallengthFormatException e) {
				System.out.println("please enter length units 'cm'.");
			}
		}
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind +"type:" + type +   " color:" + color + " totallength:" + totallength + " size:" + size + " price:" + price);
	}
}
