package assisted_practice;

import java.io.FileReader;
import java.io.IOException;

public class FileReadProg 
{

	public static void main(String[] args)
	{
		try
		{
			FileReader  r=new FileReader("C:/Users/J.Surendra/Desktop/filehandlingajava/employee1.txt");
			try
			 {
				int i;
				while((i=r.read())!=-1)
				{
					System.out.print((char)i);
				}
				
			 }
			finally
			{
				r.close();
				System.out.print("\n");
				System.out.print("File Closed successfully.");
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception handled..");
		}
	}
}
