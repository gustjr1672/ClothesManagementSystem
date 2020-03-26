import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while (num != 6) {
			System.out.println("** Clothes Management System Menu**");
			System.out.println(" 1, Add clothes");
			System.out.println(" 2, Delect clothes");
			System.out.println(" 3, Edit clothes");
			System.out.println(" 4, View clothes");
			System.out.println(" 5, show a menu");
			System.out.println(" 6, Exit");
			System.out.println("select one number between 1~6:");
			num = input.nextInt();
			if(num==1) {
				addClothes();
			}
			else if(num==2) {
				deletClothes();
			}
			else if(num==3) {
				editClothes();
			}
			else if(num==4) {
				veiwClothes();
			}
			else {
				continue;
			}
		}
	}
	public static void addClothes()  {
		Scanner input = new Scanner(System.in);
		System.out.print("clothes type");
		String clothestype = input.next();
		System.out.print("clothes color");
		String clothescolor = input.next();
		System.out.print("clothes length");
		int clotheslength = input.nextInt();
		System.out.print("clothes price");
		int clothesbrand = input.nextInt();
	}
	public static void deletClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("clothes type");
		String clothestype = input.next();
	}
public static void editClothes() {
	Scanner input = new Scanner(System.in);
	System.out.print("clothes type");
	String clothestype = input.next();
	}
public static void veiwClothes() {
	Scanner input = new Scanner(System.in);
	System.out.print("clothes type");
	String clothestype = input.next();
	}
}