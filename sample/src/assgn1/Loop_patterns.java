package assgn1;

public class Loop_patterns {

	public static void main(String[] args) {
		
		int n=5;
		
		// for printing * * * * *
		for(int i=0;i<n;i++)	
		{
			System.out.print("*" + " ");
			
		}
		
		
		System.out.println(" ------------------------different program ----------\n");
		
		
		/* for printing 
		*  
		* 
		* 
		* 	*/
		for(int i=0;i<n;i++)	
		{
			System.out.println("*" + " ");
			
		}
		
		System.out.println(" ------------------------different program ----------\n");
		/*
		 * to print 
		 * * 
		 * * 
		 * * 
		 * *     */
		 
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=2;j++)
				{
				System.out.print("*" + " ");
				}
			System.out.println();			
		}
		
		System.out.println(" ------------------------different program ----------\n");
		
/* toprt *  
		 * * 
		 * * * 
		 * * * *		 */
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		
		}
		
		System.out.println(" ------------------------different program ----------\n");
		
		
		/* to print 
		 * 100 200 300 
		   400 500 600 
		   700 800 900 
		 */
		int a=100;
		for(int i=1;i<=3;i++)
		{
			for(int j =1;j<=3;j++)
			{
				System.out.print(a + " ");
				a+=100;
			}
			System.out.println();
		}
		
		System.out.println(" ------------------------different program ----------\n");
		
	/*	to print
		a b c 
		d e f 
		g h i  */
		
		char sp='a';
		for(int i=1;i<=3;i++)
		{
			for(int j =1;j<=3;j++)
			{
				System.out.print(sp + " ");
				sp++;			
		}
			System.out.println();
		}
		
		System.out.println(" ------------------------different program ----------\n");
		
		/* to print
		  
		 * * * *
		 * * *
		 * *
		 *     */
		for(int i=4;i>=1;i--)
		{
			for(int j =i; j>=1;j--)
			{
				System.out.print("*" +" ");
				}
			System.out.println();
		}  
		
		System.out.println(" ------------------------different program ----------\n");
		
		// Write a programme to find the odd numbers from 11 to 25?
		System.out.print(" the odd number in range 11 to 25 are  ");
		for(int i =11;i<=25;i++)
		{
			if (i%2!=0)
			{
				System.out.print(i+"  ");
			}
		
		}
		System.out.println();
		
		
		System.out.println(" ------------------------different program ----------\n");
		// WAP to get the even numbers from 25 to 40? \
		System.out.print(" even numbers in the range of 25 to 40 are  " );
		for(int j=25;j<=40;j++)
		{
			if(j%2==0)
				System.out.print(j+ "  ");
			
		}
		System.out.println();
	
		System.out.println(" ------------------------different program ----------\n");
		
		/* wap to print
		#####
		#   #
		#   #
		#   #
		#####
		
		*/ 
		
		for(int i=1;i<=5;i++){
            System.out.print("+" +" ");}
            System.out.println();
            for(int i=1;i<=5;i++)
            {
                for(int j =1;j<=5;j++)
                {
                    if (j==1 || j==5)
                    System.out.print("+" +" ");
                    else 
                    System.out.print(" "+ " ");
                   }
                 System.out.println();  
               }
               for(int i=1;i<=5;i++)
            System.out.print("+" +" ");
		
		
		
		System.out.println(" ------------------------different program ----------\n");
		/* to print 
			*
		 *   *
		*  *   *   				
		or 
		
		1 
 	   2 3 
	  4 5 6    */
		
		int var =1; String sp1 =" ";
	       for(int i=1;i<=3;i++)
	       {
	           for(int k =3;k>i;k--)
	            {
	                System.out.print(sp1);
	            }
	           for(int j=1;j<i+1;j++)
	           {
	               System.out.print(var+" ");
	               var++;
	            }
	            System.out.println();
	            
	    }
		
		
	}// main

}// class
