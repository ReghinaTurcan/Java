import java.util.Arrays;
public class Integer {
	
	private static Integer[] data;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer[] = { 100, 200, 300, 400, null };
		data = methodA(data);
	}

public static Integer[] methodA(Integer[] array){

    int i = array.length;
    while( i > 0 ){
        array[i--] = array[i];
    } 
    //array[i] = null;
    return array;
}
}
