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
