package stringHandeling;

public class In {
	public static void main(String[] args) {
		String str = "Hello World";
		for (int i = 0;; i++)
			if (i == str.length())
				break;
			else if (str.charAt(i) != ' ')
				System.out.print(str.charAt(i));

//		 public static void main(String[] args) {
//		 for(int i=0;;)
//		 {
//		 System.out.println(i);
//		 }
	}

}
