import java.util.Random;

public class VaultRunner {
public static void main(String[] args) {
	Vault V = new Vault();
	JamesBond JB = new JamesBond();
	JB.findCode(V);
	V.tryCode(JB.secretCode);
	
}


}
