package KWC;

public class Ex05_3 {	//�ᱹ ������ Ǯ���� ���� �޶����� ����.

	public static void main(String[] args) {
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		
		int[] count = new int[4];
		
		for(int value : answer) {
			count[value-1]++;
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.print((i+1)+" ");
			
			for(int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			System.out.printf(" (%d)\n",count[i]);
		}

	}

}
