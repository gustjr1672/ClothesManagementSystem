import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClothesManager ClothesManger = new ClothesManager(input);

		selectMenu( input, ClothesManger);
	}
	public static void selectMenu(Scanner input,ClothesManager ClothesManger) {
		int num = 1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					ClothesManger.addClothes();
					break;
				case 2:
					ClothesManger.deletClothes();
					break;
				case 3:
					ClothesManger.editClothes();
					break;
				case 4:
					ClothesManger.veiwCloset();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 5");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	public static void showMenu() {
		System.out.println("** Clothes Management System Menu**");
		System.out.println(" 1, Add clothes");
		System.out.println(" 2, Delect clothes");
		System.out.println(" 3, Edit clothes");
		System.out.println(" 4, View clothes");
		System.out.println(" 5, Exit");
		System.out.println("select one number between 1~5:");
	}
}
