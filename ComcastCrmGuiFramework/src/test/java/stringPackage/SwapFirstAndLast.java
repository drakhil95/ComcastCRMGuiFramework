package stringPackage;

import java.util.Arrays;

public class SwapFirstAndLast {
	public static void main(String[] args) {
		String s = "Hello my name is Akhilesh";
		String[] ss = s.split(" ");
		String temp = ss[0];
		ss[0] = ss[ss.length - 1];
		ss[ss.length - 1] = temp;
		System.out.println(Arrays.toString(ss));
	}
}
