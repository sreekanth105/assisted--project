package assisted_practice;

public class modifiers {
	void display1() { 
	       System.out.println("This is defalut access specifier"); 
	   } 
	private void display2() 
	  { 
	      System.out.println("This is private access specifier"); 
	  }
	protected void display3() 
	  { 
	      System.out.println("This is protected access specifier"); 
	  } 
	public void display4() 
	  { 
	      System.out.println("This is Public Access Specifiers"); 
	  } 
	public static void main(String[] args) {
	modifiers obj = new modifiers(); 		  
 obj.display1(); 
 obj.display2();
 obj.display3();
 obj.display4();
 }
}

