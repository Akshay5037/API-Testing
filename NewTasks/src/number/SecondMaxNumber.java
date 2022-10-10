package number;

public class SecondMaxNumber {

	public static void main(String[] args) {

		int a[] = { 3, 5, 7, 8, 4, 22, 71 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[1]);
	}

}
