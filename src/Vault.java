
import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
	int num;
	int secretCode;

	public boolean tryCode(int num) {
		Random rand = new Random();
		int secretCode = rand.nextInt(1000000);
		System.out.println(secretCode);
		
		if (num == secretCode) {
			JOptionPane.showMessageDialog(null, "VAULT UNLOCKED.");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "CODE INVALID");
			return true;
		}
	}

}
// create a random 		DONE
// pass to james bond		
// crack code to make it true