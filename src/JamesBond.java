import java.util.Random;

// import java.util.Random;

public class JamesBond {
	int num;
	int secretCode;

	public int findCode(Vault V) {
		for (int i = 0; i <= 1000000; i++) {
			num = i;
			System.out.println(num+" n");
		}
		Random rand = new Random();
		int secretCode = rand.nextInt(1000000);
		System.out.println(secretCode+ "  SecretCode");
		// num = secretCode;
		// Random rand = new Random();
		// int secretCode = rand.nextInt(1000000);

		return secretCode;
	}

}