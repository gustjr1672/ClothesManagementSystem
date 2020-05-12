import java.util.ArrayList;
import java.util.Scanner;

import Clothes.Clothes;
import Clothes.ClothesInput;
import Clothes.ClothesKind;
import Clothes.FallClothes;
import Clothes.SpringClothes;
import Clothes.SummerClothes;

public class ClothesManager {
	ArrayList <ClothesInput> closet = new ArrayList <ClothesInput>();
	Scanner input;
	ClothesManager(Scanner input){
		this.input = input;
	}

	public void addClothes()  {
		int kind =0;
		ClothesInput clothesInput;
		while(kind != 1 && kind != 2) {
			System.out.println("1 for Spring Clothes");
			System.out.println("2 for Summer Clothes");
			System.out.println("3 for Fall Clothes");
			System.out.print("Select num 1, 2, or 3 for Clothes Kind");
			kind = input.nextInt();
			if (kind == 1) {
				clothesInput = new SpringClothes(ClothesKind.SpringClothes);
				clothesInput.getUserInput(input);
				closet.add(clothesInput);
				break;
			}
			else if (kind ==2) {
				clothesInput = new SummerClothes(ClothesKind.SummerClothes);
				clothesInput.getUserInput(input);
				closet.add(clothesInput);
				break;
			}
			else if (kind ==3) {
				clothesInput = new FallClothes(ClothesKind.FallClothes);
				clothesInput.getUserInput(input);
				closet.add(clothesInput);
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
		int index = findIndex(clothestype);
		removefromCloset(index, clothestype);
	}
	
	public int findIndex (String clothestype) { 
		int index = -1;
		for (int i=0; i<closet.size(); i++) {	
			if(closet.get(i).getType().equals(clothestype)) {
				index = i;
				break;
			}	
		}
		return index;
	}
	
	public int removefromCloset(int index, String clothestype) {
		if(index >= 0) {
			closet.remove(index);
			System.out.println("the clothes" + clothestype +"is deleted");
			return 1;
		}
		else {
			System.out.println("the clothes has not been registered");
			return -1;	
		}	
	}
	
	public void editClothes() {
		System.out.print("clothes type:");
		String clothestype = input.next();
		for (int i=0; i<closet.size(); i++) {
			ClothesInput clothes = closet.get(i);
			if(clothes.getType().equals(clothestype)) {	
				int num = 1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						clothes.setClothesType(input);
						break;
					case 2:
						clothes.setClothesColor(input);
						break;
					case 3:
						clothes.setClothesTotallength(input);
						break;
					case 4:
						clothes.setClothesPrice(input);
						break;
					default:
						continue;
					} //if
				} //while
				System.out.println("the clothes to be edited" + clothestype);
				break;
			}//if
		} //for
	}

	public void veiwCloset() {
		System.out.println("# of registered students:" + closet.size());
		for (int i=0; i<closet.size(); i++) {
			closet.get(i).printInfo();
		}
	} 
	
	public void showEditMenu() {
		System.out.println("** Clothes Info Edit Menu**");
		System.out.println(" 1, Edit type");
		System.out.println(" 2, Edit color");
		System.out.println(" 3, Edit totallength");
		System.out.println(" 4, Edit price");
		System.out.println(" 5, Exit");
		System.out.println("select one number between 1~5:");
	}
} 

