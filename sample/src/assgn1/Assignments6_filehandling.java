/*
===================
Q: How to find how many files & directories present?
Q: Find how many lines in a given text file?
Q: Compare 2 text files?
Q: Read only alternative lines from the file?
Q: Read from the file & write to another file in reverse order?
Q: Read from the file & store in the array.
Q: A directory contains multiple files delete only .txt files?
Q: A directory contains multiple files rename only .xlsx files?
Q: A directory contains multiple files rename only .txt files?
Q: A directory with 7 files, rename them to weekday names?
Q: A directory contains multiple files find how many .txt, .xlsx & .docx files present?
Q: File contains some content. Find how many lines, words & characters are present?
Q: Create nested Directories without using .mkDirs() method?
Q: Read Nested Directories using recursive?
Q: Difference between FileInputStream & FileReader
Q: There is a File with Sample.txt. Verify that the file is present & rename it to AAAA.txt?
Q: create 5 excel files?
=============================================
*/

package assgn1;
import java.io.*;
import java.util.Arrays;
class assignment{
	/*//How to find how many files & directories present?
	public static void howmanyfiles()
	{
		File obj=null;
		try {
			obj =new File("D:");// to use collection n then chk 
			
			
			
		}catch(Exception e) {
			
		}finally {
			
		}
	}// howmany1*/
	
	/*//Find how many lines in a given text file?
	public static void howmanylines() {
		
		BufferedReader obj = null;
		
		String s=null;
		int countline=0;
		try {
			obj = new BufferedReader(new FileReader("D:\\Md.txt"));
					
			while(true) {
				s=obj.readLine();
				countline++;
												
			if(s==null)
					break;
				}
			System.out.println(countline);												
			}		
			
		catch(Exception e) {
			System.out.println(e);
			
		}finally {
			try {
				obj.close();
				obj=null;
				s=null;				
			}catch(Exception e ) {
				System.out.println(e);				
			}			
		}
	}// howmanylines */
	
/*	// q3: Compare 2 text files?
	public static void comparetxt_file(){
		
		FileReader f1=null;
		FileReader f2=null;
		int f1_read=0;
		int f2_read =0;
		File f11=null;
		File f22 =null;
		try {
			f11= new File("D:\\Md.txt");  // txt files 
			f22=new File("D:\\Sample.txt");
			// comparing attributes of lenth , read and write permissions 
			System.out.println(" the length of file1 is " +f11.length());
			System.out.println(" the length of file2 is " +f22.length());
			System.out.println(" the write permission of file1 is " +f11.canWrite());
			System.out.println(" the write permission of file1 is " +f22.canWrite());
			
			// to compare content			
			
			
			f1 = new FileReader("D:\\Md.txt");
			f2 = new FileReader("D:\\Sample.txt");
			while(true)// til Eof
			{
				f1_read=f1.read();
				f2_read=f2.read();
				if(f1_read == -1 && f2_read == -1) {
				//	System.out.println(" both files have diff content ");
				break;
				}
				else
				{
					if(f1_read == f2_read)
						System.out.println(" same content "+ (char)f1_read);
					else
						System.out.println("then contents are different " +"in file 1 its "+(char)f1_read +"in file2 its " +(char)f2_read);
				}
				
			}
			
			
		}// try 
			catch(Exception e) {
			
		}finally {
			
		}// finally
	}// func _compare txt file  */
	
	
}// class 
public class Assignments6_filehandling {

	public static void main(String[] args) {
		
	//	assignment.howmanyfiles();
	//	assignment.howmanylines();
	//	assignment.comparetxt_file();
	}

}
