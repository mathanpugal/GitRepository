package week4.day1;


public class Keyword {
	static String s1 = "Hello";
	String s2 = "world";
	public static void main(String[] args) {
		Keyword obj=new Keyword();
		System.out.print("Static OP : ");
		obj.nonStaticMethod();
		System.out.print("Non Static OP : ");
		staticMethod();
	}

	public static void staticMethod()
	{
		System.out.print(s1);
		//System.out.println(s2);
	}
	
	public void nonStaticMethod()
	{
		System.out.println(s1);
		System.out.print(s2);
		
	}
}
