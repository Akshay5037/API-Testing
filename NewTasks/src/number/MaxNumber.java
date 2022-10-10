package number;

public class MaxNumber {

	public static void main(String[] args) {

		int[] a = { 1, 6, 4, 8, 9, 7, 15, 6, 45 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				
			}
		}
		System.out.println(max);
	}

}
