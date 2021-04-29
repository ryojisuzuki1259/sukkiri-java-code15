package code15;

public class Main {

	public static void main(String[] args) {
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.Gold());
		System.out.println(s);

	}

}
