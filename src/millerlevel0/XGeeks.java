package millerlevel0;


//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String eshaan = "invisibility";
		String miller = "teleportation";
		String david = "flight";
		String joann = "lasers";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String answer = JOptionPane.showInputDialog("What is your name?");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
		if (answer.equals("eshaan")) { 
			JOptionPane.showMessageDialog(null, "your power is " + eshaan);
		}
		else if (answer.equals("miller")) { 
			JOptionPane.showMessageDialog(null, "your power is " + miller);
		}
		else if (answer.equals("david")) { 
			JOptionPane.showMessageDialog(null, "your power is " + david);
		}
		else if (answer.equals("joann")) { 
			JOptionPane.showMessageDialog(null, "your power is " + joann);
		}
		else {
			JOptionPane.showMessageDialog(null, "you have no power");
		}
	}
}
