package stringHandeling;


public class StaticMethod {

//	public static void main(String[] args) {
//		String s = new String("java");
//		s.concat("bykiran");
//		System.out.println(s);

//		StringBuffer sb =new StringBuffer("java");
//		 sb.append("ByKiran");
//		System.out.println(sb);
//		int $_=5;

	 static int i=10; //static variable 
	    int b=20;       //global variable 
	void display() 
	{  
	  System.out.println("This is display method");
	}
	static void show() { //static method 
		System.out.println("Hello,This is JAVA BY KIRAN classes");
	  }
	public static void main(String[] args) 
	 { 
	  StaticMethod s =new StaticMethod(); 
	    s.display();
	    s.show();
	    StaticMethod s1 = null; 
	      s1.show();
	 } 
}
