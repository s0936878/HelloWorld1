/**
Hello World I
Console based 'Hello World' Program
	- User Provided Message
	- Three Methods -
		+ Main
		+ Input Method
		+ Output Method
	- Eclipse Project
	- Source Code Controlled
	- Feature Tracking (Bugzilla)
	- Documented
 * 
 */
package HelloWorld1;

import java.util.Scanner;

/**
 * @author Patrice
 * HelloWorld1 Assignment
 *
 */
public class HelloWorld1 {

	
	static Scanner input = new Scanner(System.in);
	static String name;
	
	/**
	 * 
	 * @param args
	 * Main method that controls the program
	 */
	
	//main method
	public static void main(String[] args) {
		
		//calls the input method
		input();
		
		//calls the output method
		output();

	}
	
	//input method
	public static void input(){
		
		//Greets the user and then asks the user for their name
		System.out.println("Hello World! What is your name?");
		
		//name stores the input that the user enters. Input can be any character including spaces
		name = (String)input.nextLine();
		
	}

	//output method
	public static void output(){
		
		//simply greets and outputs the user entered name.
		System.out.println("Hello World and "+ name);
	}
	


	
	
}
