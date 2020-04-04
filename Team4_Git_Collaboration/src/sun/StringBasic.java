package sun;

public class StringBasic {

	public static void main(String[] args) {
		String s = "1234";

		boolean answer = true;
		
		if (s.length() == 4 || s.length() == 6) {
			for (int i = 0; i < s.length() - 1; i++) {
				if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
					answer = false;
					break;
				}
			}
		}else {
			answer = false;
		}

		
		System.out.println(answer);

	}

}
