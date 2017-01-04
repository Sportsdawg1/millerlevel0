package millerlevel0;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		JOptionPane.showMessageDialog(null, "your score is " + score);
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String a1 = JOptionPane.showInputDialog(
				"What is greater than God, \nmore evil than the devil, \nthe poor have it, \nthe rich need it, \nand if you eat it, you will die?");
		// 4. If they got the answer right, pop up "correct!" and
		if (a1.equals("nothing")) {
			JOptionPane.showMessageDialog(null, "correct");
			// increase the
			score++;
			// score by one
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "wrong it's nothing");
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.

	}

}
