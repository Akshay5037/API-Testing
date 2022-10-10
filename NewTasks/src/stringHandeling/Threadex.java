package stringHandeling;

public class Threadex {

	public static void main(String[] args) {

		System.out.println("main begin");
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setName("JAVABYKIRAN");
		t.setPriority(9);
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println("main end");
		

	}

}
