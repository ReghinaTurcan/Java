package main;
import kitchen.Cup;

public class Application {

	public static void main(String[] args) {
		 int dif=50;
		 Cup myCupA = new Cup("Milk");
		 Cup VolumeA = new Cup(300);
		 Cup myCupB = new Cup("Water");
		 Cup VolumeB = new Cup(500);
		 
			System.out.printf("CupA: " + myCupA.getLiquidName() +" "+( VolumeA.getLiquidVolume() -dif) + "ml"+"\n");
			System.out.printf("CupB: " + myCupB.getLiquidName()+" "+( VolumeB.getLiquidVolume() + dif) +"ml"+"\n");
	
	}

}
//////////////////////////////////
package kitchen;
import java.util.Set;

public class Cup {

    private String liquidName;
    private int liquidVolume;

    	public Cup(String liquidName){
    	setLiquidName(liquidName);
    		}
    		public Cup(int liquidVolume){
			setLiquidVolume(liquidVolume);
				}
    			Cup( String liquidName, int liquidVolume ){
    				this.liquidName = liquidName;
    				this.liquidVolume = liquidVolume;
    					}
  
	///set/get
	public String getLiquidName() {
		return liquidName;
	}
		public void setLiquidName(String liquidName) {
			if(liquidName =="Water" || liquidName =="Milk" || liquidName =="Tea") {
				this.liquidName = liquidName;
			}else {
				System.err.println("Eror");
					}
		}
			public int getLiquidVolume() {
				return liquidVolume;
			}
				public void setLiquidVolume(int liquidVolume) {
					if (this.liquidVolume <=600 || this.liquidVolume <0 ) {
						this.liquidVolume = liquidVolume;
					}else {
						System.err.println("Eror");
					}
		
				}
}
