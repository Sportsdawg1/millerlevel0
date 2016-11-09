package millerlevel0;

import java.util.Random;

import javax.swing.JOptionPane;

public class ElectionPredictor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = new Random().nextInt(11);
		String win = "???";
		if (num < 6) {
			win = "Hillary";
		}
		else {
			win = "Trump";
		}
		JOptionPane.showMessageDialog(null, win + " has won the eletion!");
	}

}
