package sun;

import java.util.Scanner;

public class SmallerThanX {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] A = {1,2,3,4,5,6,7,8};
		int X = 5;
		
		for(int i = 0; i < A.length; i++) {
			if(A[i] < X) {
				System.out.print(A[i]+" ");
			}
		}
		

	}

}
