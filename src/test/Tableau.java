package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tableau {

	public static void main(String[] args) {
		/**
		 * Scanner in = new Scanner(System.in); int[] a = new int[3]; a[0] =
		 * in.nextInt(); a[1] = in.nextInt(); a[2] = in.nextInt(); int sum =
		 * Arrays.stream(a).map(i -> i % 2 == 0 ? i : -i).sum();
		 * System.out.println(sum);
		 */
		List<String> names = new ArrayList<String>();

		Scanner in = new Scanner(System.in);
		String name = in.nextLine();

		while (name.length() > 40) {
			System.out.println("Saisir un mot qui contient au plus 39 caracteres!!");
		}

		String regex = "^[a-zA-Z_]+$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()) {
			System.out.println("Good");

		} else {
			System.out.println("Bad");

		}
	}
}
