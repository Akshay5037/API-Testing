package patterns;

import java.util.Scanner;

public class NumPattern {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value ");
//		int n = sc.nextInt();
		int n=9;
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print((i + 1) + " ");
			}
			System.out.println();
		}

	}

}
