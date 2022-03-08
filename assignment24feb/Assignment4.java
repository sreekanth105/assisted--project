package assignment24feb;

	import java.util.Scanner;
	public class Assignment4 {


		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter words:");
			String str= sc.nextLine();
			String word="" + str.charAt(0);
			int len = str.length();
			
			for (int i=0; i<len;i++) {
				char ch=str.charAt(i);
				if(ch==' ') {
					word +=str.charAt(i+1);
				}
			}
			
			System.out.println(word);
			
		}

	}
