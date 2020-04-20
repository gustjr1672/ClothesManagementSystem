package Clothes;

import java.util.Scanner;

public class SummerClothes extends Clothes {
	public void getUserInput(Scanner input) {
		System.out.print("clothes type:");
		String type = input.next();
		this.setType(type);

		System.out.print("clothes color:");
		String color = input.next();
		this.setColor(color);

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

		System.out.print("clothes price:");
		String price = input.next();
		this.setPrice(totallength);
	}
}
