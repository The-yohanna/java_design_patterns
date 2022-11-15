package strategy_pattern;

public class Email implements ShareStrategy {

	@Override
	public void share() {
		System.out.println("I'm emailing the photo");
	}

}
