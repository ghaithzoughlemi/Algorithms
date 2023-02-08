package Lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class lambda {

	public static void main(String args[]) {
		ArrayList<Integer> liste = new ArrayList<Integer>(Arrays.asList(5, 6, 9, 14, 26, 29));

		liste.forEach(n -> System.out.println(n));

	}
}