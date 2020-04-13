import java.util.ArrayList;
import java.util.Scanner;

public class ClothesManager {
	ArrayList <Clothes> closet = new ArrayList <Clothes>();
	Scanner input;
	ClothesManager(Scanner input){
		this.input = input;

	}

	public void addClothes()  {
		Clothes clothes = new Clothes() ;
		System.out.print("clothes type:");
		clothes.type = input.next();
		System.out.print("clothes color:");
		clothes.color = input.next();
		System.out.print("clothes totallength:");
		clothes.totallength = input.next();
		System.out.print("clothes price:");
		clothes.price = input.next();
		closet.add(clothes);
	}
	public void deletClothes() {
		System.out.print("clothes type:");
		String clothestype = input.next();
		int index = -1;
		for (int i=0; i<closet.size(); i++) {	
			if(closet.get(i).type.equals(clothestype)) {
				index = i;
				break;
			}	

		}
		if(index >= 0) {
			closet.remove(index);
			System.out.println("the clothes" + clothestype +"is delted");
		}
		else {
			System.out.println("the clothes has not been registered");
			return;	
		}	

	}
	public void editClothes() {
		System.out.print("clothes type:");
		String clothestype = input.next();
		for (int i=0; i<closet.size(); i++) {
			Clothes clothes = closet.get(i);
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
					} //if
				} //while
				System.out.println("the clothes to be edited" + clothestype);
				break;
			}//if
		} //for
	}

	public void veiwCloset() {
		//		System.out.print("clothes type:");
		//		String clothestype = input.next();
		for (int i=0; i<closet.size(); i++) {
			closet.get(i).printInfo();
		}
	} 
} 

