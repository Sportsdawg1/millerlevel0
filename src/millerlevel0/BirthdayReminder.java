package millerlevel0;
 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
		
		// 1. correct the birthdays for your family below
		String momsBirthday = "October 25th";
		String dadsBirthday = "Sepetember 10th";
		String myBirthday = "May 23rd";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String person = JOptionPane.showInputDialog("Who?");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, person + "'s birthday is");
		// 4. if user asked for "mom"
		if (person.equals("mom")){
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		else if (person.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		else if (person.equals("me")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		else {
			JOptionPane.showMessageDialog(null, "sorry, that birthday cannot be remembered");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}