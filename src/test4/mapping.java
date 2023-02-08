package test4;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class mapping {
	public static void main(String[] args) {

	   Scanner s = new Scanner(
			   "R     A\n" +
	           "R     D\n" +
			   "A     R\n" +
	           "A     C\n" +
			   "D     R\n" +
	           "C     A\n" +
			   "C     F\n" +
	           "F     C\n" +
			   "F     B\n" +
	           "F     E\n" +
			   "B     F\n" +
	           "B     E\n" +
			   "E     F\n" +	           
			   "E     B\n");

	    Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();

	    while (s.hasNext()) {

	        String key = s.next();
	        if (!map.containsKey(key))
	            map.put(key, new LinkedList<String>());

	        map.get(key).add(s.next());
	    }

	    System.out.println(map);
	    System.out.println(map.get)
	}

}
