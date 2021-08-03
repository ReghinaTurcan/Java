import java.util.Scanner;
public class CalculatorAPP {
//main
	public static void main(String[] args) { 
		while (true)
		{UI.renderMenu();
		int a = UI.ScanInt();
		int b = UI.ScanInt();
		char op = UI.ScanOp();
		int r=0;
		if(op == '+') {
			r = Aritmetics.add(a, b);
		}
		if(op == '-') {
			r = Aritmetics.sub(a, b);
		}
		if(op == '*') {
			r = Aritmetics.mul(a, b);
		}
		if(op == '/') {
			r = Aritmetics.div(a, b);
		}
		UI.renderResult(a, b, op, r);
		int co = UI.ScanContinue();
		if (co==0) {
			break;
		}
	}
			}

//secundary classes
class Aritmetics {
	static int add(int a, int b) {
		return a+b;
	}

static int sub(int a , int b) {
	return a-b;
	}
static int mul(int a, int b) {
	return a*b;
}
static int div(int a , int b) {
return a/b;
	}
}
////
class UI{
	static void renderMenu() {
		System.out.println("-------------------------------");
		System.out.println("|        CALCULATOR           |");
		System.out.println("-------------------------------");
		System.out.println("|        insert number        |");
		System.out.println("|        and choose ops:      |");
		System.out.println("|        +,-,/,*              |");
		System.out.println("-------------------------------");
	}
	static int ScanInt() {
		Scanner in = new Scanner(System.in);
		System.out.print("enter value: ");
		int value =in.nextInt();
		return value;
	}
	static char ScanOp() {
		Scanner in = new Scanner(System.in);
		System.out.print("choose ops(+,-,/,* ): ");
		char op =in.next().charAt(0);
		return op;
	}
	static void renderResult(int a, int b,char op, int r) {
		System.out.println(a + " " + op + " " + b + " =  "+ r);
	}
	static int ScanContinue() {
		Scanner in = new Scanner(System.in);
		System.out.print("You will continue? ( 1 - yes, 0 - no ): ");
		int co =in.nextInt();
		return co;
		}
	} 
}
