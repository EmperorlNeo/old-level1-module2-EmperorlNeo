
public class PopcornRunner {
public static void main(String[] args) {
	Popcorn popcorn = new Popcorn("buttered");
	Microwave microwave = new Microwave();
	microwave.putInMicrowave(popcorn);
	microwave.setTime(3);
	microwave.startMicrowave();
	popcorn.eat();
}
}
