package millerlevel0;



import java.net.URI;

import javax.swing.JOptionPane;

	public class crazyCatLady {
		public static void main(String[] args) {
			// 1. Ask the user how many cats they have
			String cats = JOptionPane.showInputDialog("How many cats do you have?");
			// 2. Convert their answer into an int
			int cat = Integer.parseInt(cats);
			// 3. If they have more than 3 cats, tell them they're a crazy cat lady
			if (cat >= 4) {
				JOptionPane.showMessageDialog(null, "you have many cats\ntoo many to have fun with\ngive them to me now");
			}
			// 4. If they have 3 or less, call the method below to show them a cat video
			else if (cat <= 3 && cat >= 1) {
				playVideo("https://www.youtube.com/watch?v=mk4XB2wZqF4");
			}
			// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
			else if (cat == 0) {
				playVideo("https://www.youtube.com/watch?v=d6YnSXVKUiw");
			}
		}

		static void playVideo(String videoURL) {
			try {
				URI uri = new URI(videoURL);
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}


