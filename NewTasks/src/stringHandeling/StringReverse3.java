package stringHandeling;

public class StringReverse3 {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("J B K");
		
		System.out.println("String =  "+sb.toString());
		
		StringBuilder reversed=sb.reverse();
		
		System.out.println("Revarsed string = "+reversed);
	}

}
