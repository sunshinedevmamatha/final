package assgn1;
import java.util.Arrays;



/*
 * 
 * Q: WAP to sort array?
Q: WAP to reverse array?
Q: WAP to find missing number?
Q: WAP to add array?
Q: WAP where the output of method1() is a input to method2()? 
 * 
 */


class Assign_methods2 {
	
	// method to sort array
	public void sort()
	{
		int a[] = {3,1,2,5,31};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
	}
	
	// method to reverse an array
	public void rev()
	{
		
		char arr[] = {'a','b','c','d'};
		for(int i=arr.length-1;i>=0;i--) 
		
		System.out.println(arr[i]);
	}
	
	// method to input return type n pass tat as an arguement 
	double returntype(int a, int b)
	{
		
		double c =a *b;
		return c;
	}
	 
	void inputfunc(double res)
	{
		double  finalres = res /10;
		System.out.println("final value is" + finalres);
	}
	
	// method to add arrays 
	void add()
	{
		int a[]= {1,2,3};
		int b[]= {1,2,3};
		int i;
	//	int c[]= new int[a.length];
		
		for(i=0;i<a.length;i++)
		{
		 a[i]+= b[i]; // saving memory 
		}
		
	//	System.out.println(Arrays.toString(a));
		for(int item:a)
			System.out.println(item);
		
	} 
	
}
public class Assign_methods5 {
	public static void main(String[] args) {
		Assign_methods2 obj = new Assign_methods2();
		obj.sort();
		obj.rev();
		int a,b;
		a=10;
		b=20;
		double res = obj.returntype(a,b); // (a* b) in function then divide by 10
		obj.inputfunc(res);
		obj.add();

	}


}
