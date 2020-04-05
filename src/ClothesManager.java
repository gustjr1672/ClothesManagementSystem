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
		if(clothes.equals(null)) {
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

