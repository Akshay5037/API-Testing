package stringHandeling;


public class StringCount {

	public static void main(String[] args) {

		String s = "akshay";

		int[] a = new int[125];

		for (char ch : s.toCharArray()) {
			a[ch]++;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				System.out.println("Character "+(char)i+" is present "+a[i]+" times");
			}
		}

	}
}
