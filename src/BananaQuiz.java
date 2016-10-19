import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String answer = JOptionPane.showInputDialog("Do you like bananas");
		// 2. if they say no,
		// tell them they are crazy
		// and end quiz
		if (answer.equals("no")) {
			JOptionPane.showMessageDialog(null, "you are crazy");
		}
		// 3. if they say yes
		if (answer.equals("yes")) {
			answer = JOptionPane.showInputDialog("Well...whats your favorite hobby");
			JOptionPane.showMessageDialog(null, answer + " isnt as cool as bananas");
		}
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"

		// 4. OPTIONAL: if they say something other than “yes” or “no”
		// show a pop up that says “You are bananas!”

	}

}
