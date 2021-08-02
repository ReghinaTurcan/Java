import java.util.Scanner;
public class RoboWalkApp {
//main 
	public static void main(String[] args) {
	final int W =10;
	final int H =10;
		int rr = 1;
		int rc = 1;
		int gr = 3;
		int gc = 2; 
		boolean Trash=false;
		String dir ;
		Scanner in = new Scanner(System.in);
		  while (true) {
			ClearScreen();
			renderMap(W,H,rr,rc,gr,gc,Trash);
			System.out.println("direction: a,d,w,s");
			System.out.print("move >>>");
			if (rc==rr && rc==gc) {
				Trash=true;
			}
			dir = in.next();
			if (dir.equals("a") & rc != 0 ) {
				rc--;	}
			if (dir.equals("d") & rc != 9) {
				rc++;	}
			if (dir.equals("w") & rr != 0) {
				rr--;	} 
			if (dir.equals("s") & rr != 9) {
					rr++;	}
		}	
	} 	
		///custom methods
		static void renderMap(final int W, final int H, int rr, int rc, int gr, int gc,boolean Trash) {
			for(int row = 0; row <W; row++) {
				for (int col =0; col < H; col++) {
					if (row ==rr & col ==rc & row <W  ) {
						System.out.print("R ");	
					} else if ( row == gr && col == gc && Trash!=true ) {
						System.out.print("X ");
							}
				
					 else {
						System.out.print(". ");
					}
						}
						System.out.println();
				}
		}
			static void ClearScreen() {
				for (int i =0; i<20; i++) {
					System.out.println();
			}
			
		}	
		}

		
