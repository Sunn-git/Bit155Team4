package sun;

import java.util.Arrays;

public class Marathon { // Hash 쓰는 문제라는데...

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		String answer = "";
	
		Arrays.sort(completion);
		Arrays.sort(participant);
		
		for(int i = 0; i < completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}
		}
		
		if(answer.equals("")) {
			answer = participant[participant.length-1];
		}
		
		System.out.println("answer : " + answer);
		
	}

}
