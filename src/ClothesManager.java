import java.util.ArrayList;
import java.util.Scanner;

import Clothes.Clothes;
import Clothes.SummerClothes;

public class ClothesManager {
	ArrayList <Clothes> closet = new ArrayList <Clothes>();
	Scanner input;
	ClothesManager(Scanner input){
		this.input = input;
	}

	public void addClothes()  {
		int kind =0;
		Clothes clothes;
		while(kind != 1 && kind != 2) {
			System.out.print("1 for Spring Clothes ");
			System.out.print("2 for Summer Clothes, ");
			System.out.print("Select num for Clothes Kind between 1 and 2:");
			kind = input.nextInt();
			if (kind == 1) {
				clothes = new Clothes();
				clothes.getUserInput(input);
				closet.add(clothes);
				break;
			}
			else if (kind ==2) {
				clothes = new SummerClothes();
				clothes.getUserInput(input);
				closet.add(clothes);
				break;
			}
			else {
				System.out.print("Select num for Clothes Kind:");
			}
		}
	}
	public void deletClothes() {
		System.out.print("clothes type:");
		String clothestype = input.next();
		int index = -1;
		for (int i=0; i<closet.size(); i++) {	
			if(closet.get(i).getType().equals(clothestype)) {
				index = i;
				break;
			}	

		}
		if(index >= 0) {
			closet.remove(index);
			System.out.println("the clothes" + clothestype +"is deleted");
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
			if(clothes.getType().equals(clothestype)) {	
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
						String type = input.next();
						clothes.setType(type);
					}
					else if(num==2) {
						System.out.print("clothes color:");
						String color = input.next();
						clothes.setColor(color);
					}
					else if(num==3) {
						System.out.print("clothes totallength:");
						String totallength = input.next();
						clothes.setTotallength(totallength);
					}
					else if(num==4) {
						System.out.print("clothes price:");
						String price = input.next();
						clothes.setPrice(price);
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
		System.out.println("# of registered students:" + closet.size());
		for (int i=0; i<closet.size(); i++) {
			closet.get(i).printInfo();
		}
	} 
} 

