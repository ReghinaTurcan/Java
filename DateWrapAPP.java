public class DateWrapAPP {
      public static void main(String[] args) { 
    	  String text = ( "JAVA"); 
    	  System.out.println(DateWrapAp.WrapRound(text));
    	  System.out.println(DateWrapAp.wrapSquare(text));
    	  System.out.println(DateWrapAp.wrapAngle(text)); 
      } 
      
  }
  class  DateWrapAp {
  
  static String WrapRound( String text ) { 
	  return "(\""+ text + "\")";
	}
  
  static String wrapSquare( String text ) {
	  return "[" + text + "]";
  	}
  static String wrapAngle( String text ) {
	  return "<" + text + ">";
  	}
  }
