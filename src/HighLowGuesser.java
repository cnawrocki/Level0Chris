import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGuesser {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Pick a number that is 1 through 100!");
		int NumberGuess = 10;
		int highestGuess = 100;
		int lowestGuess = 1;
		int number = new Random().nextInt(100);
		for (int i = 0; i < NumberGuess; i++) {
			String num = JOptionPane.showInputDialog("is number " + number + " higher, lower, or correct");
			if (num.equals("higher")) {
				lowestGuess = number;
				int diff = highestGuess - number;
				int shift = new Random().nextInt(diff);
				number += shift;
			}
			if (num.equals("lower")) {
				highestGuess = number;
				int dif = number - lowestGuess;
				int tin = new Random().nextInt(dif);
				number -= tin;

			}
			if (num.equals("correct")) {
				JOptionPane.showMessageDialog(null, "Yay!");
				System.exit(0);
			}

		}

	}

}