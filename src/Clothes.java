
public class Clothes {
		String type;
		String color;
		String totallength;
		String price; 

		public Clothes() {
		}
		
		public Clothes(	String type, String color){	
			this.type = type;
			this.color = color;
		}
		
		public Clothes(	String type, String color, String totallength, String price)
		{	
			this.type = type;
			this.color = color;
			this.totallength = totallength;
			this.price = price;
			
		}
		public void printInfo() {
			System.out.println("type:" + type +"/" + "color:" + color +"/" + "totallength:" + totallength +"/" + "price:" + price);
		}
}


