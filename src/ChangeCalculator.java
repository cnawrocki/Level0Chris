
// Copyright The League of Amazing Programmers 2014
import java.text.NumberFormat;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String n = JOptionPane.showInputDialog("How many nickles do you have?");

		// Convert their answer to an int using Integer.parseInt()
		int ntotal = Integer.parseInt(n);

		// Ask the user how many dimes they have, and convert their answer
		String d = JOptionPane.showInputDialog("How many dimes do you have?");
		int dtotal = Integer.parseInt(d);

		// Ask the user how many quarters they have, and convert their answer
		String q = JOptionPane.showInputDialog("How many quarters do you have?");
		int qtotal = Integer.parseInt(q);

		// Calculate how much money the user has and save it in a double
		// variable
		double total = ((ntotal * .05 + dtotal * .10 + qtotal * .25));
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "Your total is " + nf.format(total));

	}
}
