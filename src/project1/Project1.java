package project1;
import java.util.Scanner;

public class Project1 {		

	public static void main(String[] args) {	//parameter //this is a method
		// TODO Auto-generated method stub
		System.out.println("Enter in a name...");		//this is output 
		
		Scanner in = new Scanner(System.in);	//input a value 
//		String s = in.nextLine();				//next line 
		
//		if(s.equals("Michael")) {
//			System.out.println("Hey Michael");
//		} else if (s.equals("John")) {
//			System.out.println("Hey John");
//		}	else System.out.println("Nice try buddy");
	
		//introduction to loops
		int i = 0;								//intitialization 
		
		do {
			System.out.println("i is: " + i);
			i++;
		} while(false);							//condition is false so loop ends here
		
		
//		while(i < 10) {							//condition
//			System.out.println("i is: " + i);
//			i++;								//update
//		}
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("i is: "+ i);
//		}
		
		in.close();
		
//		int a = 5;								//declaring an integer 
//		char b = 't';							//declaring a character NOT string 
//		
//		System.out.println(s);				//output the input from line 10
//		System.out.println(a);
//		System.out.println(b);
	}

}
