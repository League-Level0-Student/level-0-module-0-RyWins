package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int Score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String answer = JOptionPane.showInputDialog("How many states are in the U.S.");
				// 3.  Use an if statement to check if their answer is correct
				
				if(answer.equals("50"))
				{
				JOptionPane.showInputDialog("Correct");
				
				Score =+ 1;
				}
				else
				
				{
					JOptionPane.showInputDialog("Incorrect");
				}
				
				
				String answer1 = JOptionPane.showInputDialog("What is 10 multiplied by 10 eqaul");
				
				if(answer1.equals("100")) {
					
					JOptionPane.showInputDialog("Correct");
					
					int Score1 = + 1;
				}
				else
				
				{
					JOptionPane.showInputDialog("Incorrect");
				}
				String input = JOptionPane.showInputDialog("Final score: 2");
				
				// 4.  if the user's answer was correct, add one to their score 
					
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	
		}

	
		
	}
