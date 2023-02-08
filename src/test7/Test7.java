package test7;

public class Test7 {

	public static void main(String args[]) {

		String s = "abcabc";
		int len = s.length();
		char[] arr = s.toCharArray();
		int[] t = new int[3];
		int res = 0;
		int count = 0;
		int l = 0;
		for (int i = 0; i < len; i++) {
			t[arr[i] - 'a']++;
			System.out.println("T " + i + " " + t[i]);
			System.out.println("T " + i + " " + t[arr[i] - 'a']);
			while (t[0] > 0 && t[1] > 0 && t[2] > 0) {
				count++;
				t[arr[l] - 'a']--;
				l++;
			}
			res += count;
		}
		System.out.println(res);
	}

}
