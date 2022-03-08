package assisted_practice;

public class CustomException
{
	public String check(int m,int n) throws ValueCheckException
	{
		if(m>n)
		{
			throw new ValueCheckException("yes there is a error in this code.... check once");
			
		}
		else
		{
			System.out.println("thank you");
		}
		return "yes ok";
		
	}
	public static void main(String[] args) throws Exception 
	{
		CustomException c=new CustomException();
		try
		{
			c.check(55, 5);
		}
		catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	}

}
class ValueCheckException extends Exception
{
	public ValueCheckException(String d)
	{
		super(d);
		
	}
	
}
