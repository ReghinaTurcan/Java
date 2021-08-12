// main class
import java.util.Scanner;
  public class DataFlowApp {
      public static void main(String[] args) {
    	  DataTransformer.SelectConvertion();
    	  Scanner in = new Scanner(System.in);
    	  System.out.print("Select convertion: ");
    	  int value1 =in.nextInt();
 		  
 		 if (value1 ==1) {
 			System.out.print("Insert value for convertion: ");
 	 		  int value =in.nextInt();
 			 if (value>=127 || value<=-128 ) {
 				System.err.println("WARNING! the value " +value+ " overflows \"byte\" range. DATA will was lost!"); 
 			 } else 
   		  System.out.println(DataTransformer.integerToByte(value));
 		 } 
 		 if (value1 ==2) {
  			System.out.print("Insert value for convertion: ");
  	 		  byte value =in.nextByte();
  			 if ( value>=127 || value<=-128 ) {
  				System.err.println("WARNING! the value " +value+ " overflows \"byte\" range. DATA will was lost!"); 
  			 } else 
    		  System.out.println(DataTransformer.byteToInteger(value));
  		} 
 		if (value1 ==3) {
  			System.out.print("Insert value for convertion: ");
  	 		  double value =in.nextDouble();
    		  System.out.println(DataTransformer.doubleToInteger(value));
        }
 		if (value1 ==4) {
  			System.out.print("Insert value for convertion: ");
  	 		  int value =in.nextInt();
    		  System.out.println(DataTransformer.integerToDouble(value));
 		}	
 		if (value1 ==5) {
  			System.out.print("Insert value for convertion: ");
  	 		  short value =in.nextShort();
    		  System.out.println(DataTransformer.shortToInteger(value));
 		}
 		if (value1 ==6) {
  			System.out.print("Insert value for convertion: ");
  	 		  int value =in.nextInt();
    		  System.out.println(DataTransformer.integerToShort(value));
      }	
 		if (value1 ==7) {
  			System.out.print("Insert value for convertion: ");
  	 		  double value =in.nextDouble();
    		  System.out.println(DataTransformer.doubleToShort(value));
      }	
  }
  // secondary class
  class DataTransformer {
	  static void SelectConvertion() {
			System.out.println("Convertion List");
			System.out.println(" 1. integerToByte()\r\n"
					+ " 2. byteToInteger()\r\n"
					+ " 3. doubleToInteger()\r\n"
					+ " 4. integerToDouble()\r\n"
					+ " 5. shortToInteger()\r\n"
					+ " 6. integerToShort()"
					+ " 7. doubleToShort()");	
	  }
	  static int integerToByte(int value) {
		 byte bb = (byte) value;
		 return bb;
	  }
	  static byte byteToInteger(byte value) {
			 int ii = value & 0xFF;
			 return value; 
	  } 
	  static double doubleToInteger(double value) {
		  int di = (int) value;
			 return di;  
	  }
	  static double integerToDouble(double value) {
		  int ddd = (int) value;
			 return ddd;  
	  }
	  static short shortToInteger(short value) {
		  int si = (int) value;
			 return value;  
	  }
	  static int integerToShort(int value) {
		  short ss = (short) value;
			 return ss;  
	  }
	  static double doubleToShort(double value) {
		  short ss = (short) value;
			 return ss;  
	  }
  	}
  }
 
