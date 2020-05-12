package Clothes;

import java.util.Scanner;

public abstract class LongClothes extends Clothes {
	
	public LongClothes(ClothesKind kind) {
		super(kind);
	}

	public abstract void getUserInput(Scanner input);
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind +"type:" + type +   " color:" + color + " totallength:" + totallength + " price:" + price);
	}
	public void setClothesTotallengthwithYN(Scanner input) {
		char answer = 'x';

		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you know clothes totallength? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("clothes totallength:");
				String totallength = input.next();
				this.setTotallength(totallength);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setTotallength("");
				break;
			}
			else {

			}
		}
	}
}
