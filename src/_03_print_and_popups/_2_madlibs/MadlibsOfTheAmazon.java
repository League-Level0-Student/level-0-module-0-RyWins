package _03_print_and_popups._2_madlibs;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		String prompt =  "If you find yourself having to cross a piranha-infested river, here's how to do it...";
		
		// Get the player to enter an adjective
		String prompt1 = "viscious";
		// Get the player to enter a type of liquid
		String prompt2 = "The liquid is water";
		// Get the player to enter a body part
		String prompt3 = "toe";
		// Get the player to enter a verb
		String prompt4 = "Swim";
		// Get the player to enter a place
		String prompt5 = "Alaska";
		// The story below has has been written as a group of Strings joined together by + signs.
		// The story contains place holders, indicated by [** **] which you need to replace with
		// the values entered by the player.
		// Hint:  You will need to add more + signs to join the variables to the other parts of the story.
		
		String story = 
		"Piranhas are more [**viscious**] during the day, so cross the river at\n"  +
		"night. Piranhas are attracted to fresh [**water**] and will most\n"  +
		"likely take a bite out of your [**toe**] if you [**swim**]. Whatever\n"  +
		"you do, if you have an open wound, try to find another way to get\n"  +
		"back to the [**Alaska**]. Good luck!";
		
		// Make a pop-up that contains the final story. The \n escape characters add line breaks to the story. 
		// If you need to, move them around to make your story look better in the pop-up
		
		// If you want to write your own Madlib story, just change the story variable and ask the player different questions.

	}
}