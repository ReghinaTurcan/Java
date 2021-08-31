package main;
import geometry.Line;

public class Application {

	public static void main(String[] args) {
		Line ver = new Line(10,20,30,40);
		ver.printCoords();
		System.out.println( ver.printCoords());
		System.out.println("--------------");
		
			 System.out.println("Test A");
			 Line short_horizontal_line = new Line(100,0,200,0);
			 short_horizontal_line.printCoords();
			 System.out.println( short_horizontal_line.printCoords());
			 System.out.println( short_horizontal_line.lenght());
			 
			 	System.out.println("Test B");
				 Line long_diagonal_line = new Line(100,100,500,500);
				 long_diagonal_line.printCoords();
				 System.out.println( long_diagonal_line.printCoords());
				 System.out.println( long_diagonal_line.lenght());
	  }
	
}

///////////////////////////////
package geometry;

public class Line {
	public int startX;
	public int endX;
	public int startY;
	public int endY;
	//CONSTRUCTOR
		public Line(int startX,int startY,int endX,int endY) {
			if (this.startX ==this.endX || this.startY ==this.endY) {
			System.err.println("Eror");
		} else {
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
			}
		}
		
			public String printCoords(){
				return "["+startX+":" + startY+ "]" +"----->"+ "["+endX+":" + endY+ "]";
			}
				public int lenght() {
					int distance = (int)Math.sqrt(Math.pow((this.endX- this.startX),2)+ Math.pow((this.endY- this.startY),2));
					return distance;
				}
}
