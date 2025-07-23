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
//		int i = 0;								//declaring variable
		
//		do {
//			System.out.println("i is: " + i);	//print statement
//			i++;								//this is telling i (0) to increment by 1 each time 
//		} while(false);							//condition is false so loop ends here
//		
//		
//		while(i < 10) {							//condition
//			System.out.println("i is: " + i);
//			i++;								//update
//					}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("i is: "+ i);
		}
		
		in.close();
		
//		int a = 5;								//declaring an integer 
//		char b = 't';							//declaring a character NOT string 
//		
//		System.out.println(s);				//output the input from line 10
//		System.out.println(a);
//		System.out.println(b);
		
	
	
	}

}


//package loginTest;
//
//import java.util.Scanner;
//
//public class LoginTest {
//
//    public static void main(String[] args) {
//        // Fixed value for username and password
//        String user = "Michael";
//        String pass = "Password"; 
//        
//        Scanner in = new Scanner(System.in);  // Input from the user
//
//        // Ask for username
//        System.out.print("Username: ");
//        String Username = in.nextLine();  // Entered by user
//
//        // Ask for password
//        System.out.print("Password: ");
//        String Password = in.nextLine();  // Entered by user
//
//        // Check if entered username and password match the stored values
//        if (Username.equals(user) && Password.equals(pass)) {
//            System.out.println("Access Granted");
//        } else {
//            System.out.println("THINK AGAIN");
//        }
//
//        in.close();
//    }
//}




