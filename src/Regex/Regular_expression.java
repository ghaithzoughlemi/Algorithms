package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_expression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir votre expression: ");
		String regex = sc.next();
		System.out.println("Regex: " + regex);
		String pattern = "^p[a-z].[A-Z]+q$";

		// Pattern pattern = Pattern.compile("^[a-z]+_[a-z]+$",
		// Pattern.CASE_INSENSITIVE);
		// Matcher matcher = pattern.matcher(regex);

		boolean matchFound = regex.matches(pattern);
		if (matchFound) {
			System.out.println("Match found: " + regex);
		} else {
			System.out.println("Match not found");
		}
	}

}