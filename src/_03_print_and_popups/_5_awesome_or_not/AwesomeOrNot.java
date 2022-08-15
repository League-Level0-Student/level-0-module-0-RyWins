package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) { 
		//Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		Random ran = new Random(); 
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		ran.nextInt(4);
		// 3. Print your variable to the console
		JOptionPane.showInputDialog(new Random());
		// 4. Get the user to enter something that they think is awesome
		String answer = JOptionPane.showInputDialog("What is something that is awesome?");
		// 5. If your variable is  0
		
		if(ran.equals(0));
		{
			JOptionPane.showInputDialog("Awesome");
		}
	
		
			
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
		if(ran.equals(1));
		{
			JOptionPane.showInputDialog("ok");	
		}
			// -- tell the user whatever they entered is ok.
		
		// 7. If your variable is  2
		if(ran.equals(2));
		{
			JOptionPane.showInputDialog("Boring");	
		}
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
		if(ran.equals(3));
		{
			JOptionPane.showInputDialog("That is Awesome!");	
		}
			// -- invent your own message to give to the user (be nice).
	}
}