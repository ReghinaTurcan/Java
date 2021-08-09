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



///////////////Partea 2///////////////////////////////////
public class DateWrapAPP {
      public static void main(String[] args) { 
    	  System.out.println(DateWrapAp.WrapRound("array"));
    	  System.out.println(DateWrapAp.wrapSquare("tag"));
    	  System.out.println(DateWrapAp.wrapAngle(0.5)); 
      }  
  }
  class  DateWrapAp {
  static String WrapRound( String text ) { 
	  return "("+ text + ")";
	}
  static String WrapRound( int text ) { 
	  return "("+ text + ")";
	}
  static String WrapRound( double text ) { 
	  return "("+ text + ")";
	}
  static String WrapRound( char text ) { 
	  return "("+ text + ")";
	}
 ///
  static String wrapSquare( String text ) {
	  return "[" + text + "]";
  	}
  static String wrapSquare( int text ) {
	  return "[" + text + "]";
  	}
  static String wrapSquare( double text ) {
	  return "[" + text + "]";
  	}
  static String wrapSquare( char text ) {
	  return "[" + text + "]";
  	}
  ////
  static String wrapAngle( String text ) {
	  return "<" + text + ">";
  	}
  static String wrapAngle( int text ) {
	  return "<" + text + ">";
  	}
  static String wrapAngle( double text ) {
	  return "<" + text + ">";
  	}
  static String wrapAngle( char text ) {
	  return "<" + text + ">";
  	}
  }
