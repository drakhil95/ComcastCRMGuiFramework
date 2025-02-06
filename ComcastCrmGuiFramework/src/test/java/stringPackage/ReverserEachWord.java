package stringPackage;

public class ReverserEachWord {

	public static void main(String[] args) {
		String s = "Hello, My name is Akhilesh";
		String[] ss = s.split(" ");
		
		for (int i = 0; i < ss.length; i++) {
			StringBuilder sb = new StringBuilder(ss[i]);
			sb.reverse();
			System.out.print(sb + " ");
		}
	}
}
