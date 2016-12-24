import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int user = JOptionPane.showOptionDialog(null, "Which door should you go through?", "Riddle 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "A room filled with lions that have not eaten in months", "A room filled with ninjas", "A neverending dark pit" }, null);
		if (user == 0) {
			user = JOptionPane.showOptionDialog(null, "Robert's mom has three kids, one is named apple and another one is named pear. What is the name of the other kid?",
					"Riddle 2", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Neither", "Banana", "Orange" }, null);
			if (user == 0) {
				user = JOptionPane.showOptionDialog(null, "Which month has 28 days?", "Riddle 3", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Febuary", "All of them", "None of them" }, null);
				if (user == 1) {
					user = JOptionPane.showOptionDialog(null, "If there are 6 apples and you take away 4, how many apples do you have?", "riddle 4", 0,
							JOptionPane.INFORMATION_MESSAGE, null, new String[] { "2", "4", "6" }, null);
					if (user == 1) {
						user = JOptionPane.showOptionDialog(null, "If it takes 8 men to build a wall in 4 hours, how long will it take 4 men to build the wall?",
								"The final riddle", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "8 hours", "0 Hours", "It's impossible to know" }, null);
						if (user == 1) {
							JOptionPane.showMessageDialog(null, "You are a winner!");
						} else {
							JOptionPane.showMessageDialog(null, "You got four right, so close!");
						}
					} else {
						JOptionPane.showMessageDialog(null, "You got three right, not too bad.");
					}
				} else {
					JOptionPane.showMessageDialog(null, "You got two right, meh.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "You only got one right, I'm disappointed.");
			}

		} else {
			JOptionPane.showMessageDialog(null, "You didn't even get one right, what a shame.");
		}
	}
}
