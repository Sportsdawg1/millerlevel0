package millerlevel0;

import javax.swing.JOptionPane;

public class NumberSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program that asks the user for 3 numbers. Then print the Numbers in ascending order. 
//		Print the numbers in descending order.
		String o = JOptionPane.showInputDialog("What is your first number?");
		int one = Integer.parseInt(o);
		String t = JOptionPane.showInputDialog("What is your second number?");
		int two = Integer.parseInt(t);
		String th = JOptionPane.showInputDialog("What is your third number?");
		int three = Integer.parseInt(th);
//		/123, /132, /213, /231, 312, 321
		
		if (one < two && two < three) {
			System.out.println(one + "," + two + "," + three);
			System.out.println(three + "," + two + "," + one);
		}
		else if (one < three && two > three) {
			System.out.println(one + "," + three + "," + two);
			System.out.println(two + "," + three + "," + one);
		}
		else if (one > two && one < three) {
			System.out.println(two + "," + one + "," + three);
			System.out.println(three + "," + one + "," + two);
		}
		else if (three > two && one > three) {
			System.out.println(two + "," + three + "," + one);
			System.out.println(one + "," + three + "," + two);
		}
		else if (three < one && one < two) {
			System.out.println(three + "," + one + "," + two);
			System.out.println(two + "," + one + "," + three);
		}
		else if (three < two && two < one) {
			System.out.println(three + "," + two + "," + one);
			System.out.println(one + "," + two + "," + three);
		}
	}

}
