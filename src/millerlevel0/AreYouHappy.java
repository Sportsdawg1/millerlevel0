package millerlevel0;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		speak("these are all yes or no questions");
		JOptionPane.showMessageDialog(null, "these are all yes or no questions");
		speak("are you happy?");
		String a1 = JOptionPane.showInputDialog("are you happy");
		if (a1.equals("yes")) {
			speak("do you want to be happy?");
			String a15 = JOptionPane.showInputDialog("do you want to be happy");
			if (a15.equals("yes")) {
				speak("keep doing your life normally");
				JOptionPane.showMessageDialog(null, "keep doing your life normally");
			}
			else if (a15.equals("no")) {
				speak("change something");
				JOptionPane.showMessageDialog(null, "change something");
			}
		}
		else if (a1.equals("no")) {
			speak("do you want to be happy?");
			String a2 = JOptionPane.showInputDialog("do you want to be happy");
			if (a2.equals("no")) {
				speak("keep doing your life normally");
				JOptionPane.showMessageDialog(null, "keep doing your life normally");
			}
			else if (a2.equals("yes")) {
				speak("change something");
				JOptionPane.showMessageDialog(null, "change something");
			}
		}
	}
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	}
}

