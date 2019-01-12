import javax.swing.JOptionPane;

public class Vault {
	int secretCode;

public boolean tryCode(int num) {
	if(num==secretCode) {
		JOptionPane.showMessageDialog(null, "VAULT UNLOCKED.");
		return true;
	}
	else {
		JOptionPane.showMessageDialog(null, "CODE INVALID");
		return false;
	}
}

}
