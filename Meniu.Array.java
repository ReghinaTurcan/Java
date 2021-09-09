import java.util.Scanner;

public class ExempluArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);
	
	String [] food_names = {"Pizza", "Kebab","Soup"};
	float [] food_prices = {75.00f, 100.00f,45.00f};
	int [] food_avai = {0, 2,8};
	//int [] food_quantity = {1, 2,0};
	
	System.out.println("What are you interested in? ");
	String food_name_to_find = in.next();
	//update->
	for (int i =0; i < food_prices.length; i++) {
		if(food_prices[i]>= 50.00f) {
			food_prices[i] *=0.9f;
		}
	}
	//find
	//HW1 
	int i;
	 for (i = 0; i < food_names.length; i++) {
		if(food_names[i].equals(food_name_to_find) ) {
			if (food_avai[i]>0) {
			System.out.println("Total available " + food_avai[i] + " ! " );	
			System.out.println("Yes! we have " + food_name_to_find + " ! " );
			System.out.println("it cost " + food_prices[i] + " MDL " );
			break; 
			} 
		} 
	}  
	
			if(i==food_names.length) {
					System.out.println("No we have " + food_name_to_find + " ! " );			
			}
					//	float total_cost =0;
					//	//show order items
					//	for(int i = 0; i<3; i++) {
					//		if(food_quantity[i] >0) {
					//			float item_cost = food_prices[i] * food_quantity[i];
					//			System.out.printf("%20s [%7.2fMDL] x %3d = %7.2fMDL\n",
					//					food_names[i],food_prices[i],food_quantity[i], item_cost);
					//		
					//		total_cost += item_cost;
					//	}
					//	}
					//	System.out.printf(" \n total= %7.2fMDL\n", 
					//			total_cost); //sum
						}
							}
