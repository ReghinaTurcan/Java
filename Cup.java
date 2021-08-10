
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
