package assgn1;

class Sample2
{
	public static double monthlySal() {
		return 50000.50;
	}
	
	Sample2(double sal){
		System.out.println(sal * 12);
	}
}

public class Getter_Setter {
	public static void main(String[] args) {
		new Sample2(Sample2.monthlySal());
	}
}
