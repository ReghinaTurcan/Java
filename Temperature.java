import java.util.Random;
import java.util.Scanner;
	public class Temperature {
      public static void main(String[] args) {
    	  Scanner in = new Scanner(System.in);
    	  System.out.print("Number of country: ");
    	  int value =in.nextInt();
    	  if (value==660 || value==533 || value==204 || value==535 || value==120) {
    		  System.out.printf("Temperature: %.1f\n",  OpenMeteoProvider.getCurrentTemperature(value));
    		  System.out.println( "Humidity is: "+ Hum.getCurrentHumidity(value)+ " %");
    	  }else 
    		  System.err.println("\"Can't provide data for this country!\".");  	   
 		 } 
  }
	  class OpenMeteoProvider {
		    static double getCurrentTemperature( int countryCode ){
		    	Random r = new Random();
		    	double tempMin = -50.0;
		    	double tempMax = 50.0;
		    	double diff = tempMax - tempMin;
		    	double Value = tempMin + (diff) * r.nextDouble();
		    		return  Value+1;
		    		}
		    }
	  class Hum extends OpenMeteoProvider  {
		    	static byte getCurrentHumidity( int countryCode ){
		    		OpenMeteoProvider.getCurrentTemperature(countryCode);
		        	Random r = new Random();
		        	int humMax = 100;
		        	int Value = r.nextInt(humMax);
		    		return (byte) Value;
		    		}
		    }

