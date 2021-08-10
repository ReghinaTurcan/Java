
public class Cup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Cupp.PrintInfo();
	}
}
///parents class
class Cupp{
	static int volume_ml =500;
	
	static void PrintInfo() {
		int fill = 100 * Drink.volume_ml / volume_ml; 
if (fill<=99){
		 
		System.out.printf("========Cup(%3dml  %3d)=======\n",volume_ml,fill);
		//par see child
		Drink.PrintInfo();
		System.out.println("=============================");
		} else System.out.println("Wrong volume!!!");
	}
	//child class
	static class Drink{
		static String name ="Tea";
		static int volume_ml = 550;
		
		static void PrintInfo() {
			System.out.printf("--Drink: %s-\n",name);
		}
	}
}
///////////////Drink////////
public class Drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drinkk.printInfo();
		HotDrink.printInfo();
		SportDrink.printInfo();
	}
}
//super class
class Drinkk{
	static String name = "Something New";
			//methods
	static void printInfo() {
		System.out.println("===== Drink =====");
		System.out.printf("|%16s|\n",name);
		System.out.println("===== Drink =====");
	}
}
//extended class
class HotDrink extends Drinkk{
	static float temperature = 77.77f;
	//polymorphism OVERRIDNG
	static void printInfo() {
		//del.	System.out.println("===== Drink =====");
		//del.	System.out.printf("|%16s|\n",name);
		Drinkk.printInfo();
		System.out.printf("|%16.1f|\n",temperature);
		System.out.println("===== Drink =====");
	}	
}
class SportDrink extends HotDrink{
	static double recommended_consume = 30/60d;
	static void printInfo() {
		HotDrink.printInfo();
		System.out.println("|" + recommended_consume + " gr/minute" + "   |");
		System.out.println("===== End =====");
	}
}

