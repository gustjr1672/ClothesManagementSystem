import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClothesManager ClothesManger = new ClothesManager(input);
		
		int num = 1;

		while (num != 5) {
			System.out.println("** Clothes Management System Menu**");
			System.out.println(" 1, Add clothes");
			System.out.println(" 2, Delect clothes");
			System.out.println(" 3, Edit clothes");
			System.out.println(" 4, View clothes");
			System.out.println(" 5, Exit");
			System.out.println("select one number between 1~5:");
			num = input.nextInt();
			if(num==1) {
				ClothesManger.addClothes();
			}
			else if(num==2) {
				ClothesManger.deletClothes();
			}
			else if(num==3) {
				ClothesManger.editClothes();
			}
			else if(num==4) {
				ClothesManger.veiwClothes();
			}
			else {
				continue;
			}
		}
	}
}
	