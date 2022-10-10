package number;

public class Numberss {

	public static void main(String[] args) {
		int n=1729;
		int rem=0;
		int i,j,v = 0;
		while(n>0) {
			rem=n%10;
			 v=(rem*10)+v;
			 n=n/10;
			 for(i=1;i<=rem;i++) {
				 System.out.print(rem+" ");
			 }
			 System.out.println();
		}
	}

}
