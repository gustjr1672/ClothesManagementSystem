import java.util.Scanner;

public class ClothesManager {
	Clothes clothes;
	Scanner input;
	ClothesManager(Scanner input){
		this.input = input;
		
	}
	
	public void addClothes()  {
		clothes = new Clothes() ;
		System.out.print("clothes type:");
		clothes.type = input.next();
		System.out.print("clothes color:");
		clothes.color = input.next();
		System.out.print("clothes totallength:");
		clothes.totallength = input.next();
		System.out.print("clothes price:");
		clothes.price = input.next();
	}
	public void deletClothes() {
		System.out.print("clothes type:");
		String clothestype = input.next();
		if(clothes == (null)) {
			System.out.println("the clothes has not been registered");
			return;
		}
		if(clothes.type.equals(clothestype)) {
			clothes = null;
			System.out.println("the clothes is delted");
		}	
	}
	public void editClothes() {
		System.out.print("clothes type:");
		String clothestype = input.next();
		if(clothes.type.equals(clothestype)) {	
			int num = 1;

			while (num != 5) {
				System.out.println("** Clothes Info Edit Menu**");
				System.out.println(" 1, Edit type");
				System.out.println(" 2, Edit color");
				System.out.println(" 3, Edit totallength");
				System.out.println(" 4, Edit price");
				System.out.println(" 5, Exit");
				System.out.println("select one number between 1~5:");
				num = input.nextInt();
				if(num==1) {
					System.out.print("clothes type:");
					clothes.type = input.next();
			}
				else if(num==2) {
					System.out.print("clothes color:");
					clothes.color = input.next();
			}
				else if(num==3) {
					System.out.print("clothes totallength:");
					clothes.totallength = input.next();	
				}
				else if(num==4) {
					System.out.print("clothes price:");
					clothes.price = input.next();
			}
				else {
					continue;
			}
		}
		System.out.println("the clothes to be edited" + clothestype);
	}
	}
	public void veiwClothes() {
		System.out.print("clothes type:");
		String clothestype = input.next();
		if(clothes.type.equals(clothestype)) {
		clothes.printInfo();
	}
	} 
} 

