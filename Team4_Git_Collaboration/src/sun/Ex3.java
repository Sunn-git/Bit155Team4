package sun;

public class Ex3 {

	public static void main(String[] args) {
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		
		int[] answerNumber = new int[4];
		
		for(int i : answer) {
			answerNumber[i-1]++;
		}
//		for(int i = 0; i < answer.length; i++) {
//			answerNumber[answer[i]-1]++;
//		}
		
		for(int i = 0; i < answerNumber.length; i++) {
			System.out.print((i+1)+"	");
			
			for(int j = 0; j < answerNumber[i]; j++) {
				System.out.print("*");
			}
			System.out.printf("	(%d)", answerNumber[i]);
			System.out.println();
			
		}


	}

}
