package stringHandeling;

public class StringRev {

	public static void main(String[] args) {

		String s = "AJAY Choure";// 4

		String s1[] = s.split(" ");

//		StringBuffer sb=new StringBuffer(s);

		for (int i = s1.length-1; i >= 0; i++,i--) {
//			s1=s1+s.charAt(i);

			System.out.print(s1[i] + " ");
		}
	}
}
