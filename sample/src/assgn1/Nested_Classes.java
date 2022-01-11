package assgn1;


class Outer
{
	String name = "Kalam";
	static String city = "RAICHUR";
	
	public void outerMethod1() {
		System.out.println("Outer: instance method outerMethod1()");
	}
	
	public static void outerMethod2() {
		System.out.println("Outer: static method outerMethod1()");
	}
	
	public void a() {
		Inner in = new Inner();
		System.out.println("Country is: " + in.country);
		in.innerMethod1();
		in.innerMethod2();
	}
	
	class Inner
	{
		String country = "India";
		public void innerMethod1() {
			System.out.println("Inner: instance method innerMethod1()");
		}
		
		public  void innerMethod2() {
			System.out.println("Inner: instance method innerMethod2()");
		}
		
		Inner(){
			System.out.println("Name is: "+ name);
			System.out.println("City is: "+ city);
			
			outerMethod1();
			outerMethod2();
			System.out.println("****************************");
		}
	}
}

public class Nested_Classes {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.a();
	}
}
