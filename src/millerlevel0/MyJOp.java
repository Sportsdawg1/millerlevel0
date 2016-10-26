package millerlevel0;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MyJOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Test Message", "Test Title", 0, getIcon());
	}
	static ImageIcon getIcon() {
		return new ImageIcon("Image/Check_Mark-512.png");
	}
}
