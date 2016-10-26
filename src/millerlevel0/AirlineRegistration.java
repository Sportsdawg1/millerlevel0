package millerlevel0;

import javax.swing.JOptionPane;

public class AirlineRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Airline registration 
		 * 
		 * You are writing a program for a new airline to take their registration information at the check-in counter
		 * and print their boarding pass. You need to collect the following information: 
		 * 		First name 
		 * 		Last name
		 * 		Destination airport 
		 * 		Birthday (for security purposes) 
		 * 		Male/female (for security purposes) 
		 * 
		 * Print the boarding pass in this format:
		 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
		 * Traveling to: DESTINATION
		 * 
		 * Toolbox: main() method, JOptionPane.showInputDialog, variables
		 * 
		 **/
			for (int i = 1; i < 11; i++) {
				String fname = JOptionPane.showInputDialog("what is your first name?");
				String lname = JOptionPane.showInputDialog("what is your last name?");
				String destair = JOptionPane.showInputDialog("what is your destination airport?");
				String bday = JOptionPane.showInputDialog("what is your birth date?");
				String gen = JOptionPane.showInputDialog("what is your gender?");
				String tsa = JOptionPane.showInputDialog("do you have TSA Pre-Check?");
				if (tsa.equals("yes")) {
					tsa = "TSA PreCheck";
				}
				else {
					tsa = " ";
				}	
				JOptionPane.showMessageDialog(null, lname + " / " + fname + " (" + bday + ", " + gen + ")\n" + "Traveling to: " + destair + "\n" + tsa + "\nNumber of Passengers = " + i);
			}
			
		}
		
}
		
		
		
		
		
				/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
				*/
			
	


