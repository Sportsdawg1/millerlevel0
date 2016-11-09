package millerlevel0;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGuesser {
	public static void main(String[] args) {
		int numGuess = 10;
		String pIck = JOptionPane.showInputDialog("Choose a number between 1 and 100");
		int pick = Integer.parseInt(pIck);
		for (int i = 0; i < numGuess; i++) {
			int guess = new Random().nextInt(101);
			int a1 = JOptionPane.showConfirmDialog(null, "the number is " + guess + "\nis the number higher, lower, or equal to the number you guessed?");
			System.out.println(a1);
		}
	}

}
