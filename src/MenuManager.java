import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in);
		ClothesManager clothesManager = getObject("clothesmanager.ser");
		if(clothesManager ==null) {
			clothesManager =new ClothesManager(input);
		}
		else {
			clothesManager.setScanner(input);
		}
		selectMenu( input, clothesManager);
		putObject(clothesManager, "clothesmanager.ser");
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
					logger.log("add a clothes");
					break;
				case 2:
					ClothesManger.deletClothes();
					logger.log("delet a clothes");
					break;
				case 3:
					ClothesManger.editClothes();
					logger.log("edit a clothes");
					break;
				case 4:
					ClothesManger.veiwCloset();
					logger.log("veiw a list of clothes");
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
	public static ClothesManager getObject(String filename) {
		ClothesManager clothesManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			clothesManager = (ClothesManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return clothesManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clothesManager;
	}
	public static void putObject(ClothesManager clothesManager,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(clothesManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
