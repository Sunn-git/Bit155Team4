package KWC;

import java.util.Scanner;

public class Ex05_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intarr = {45, 20, 63, 2, 71, 38, 86, 99, 12, 54};
	
		String strintarr = "";
		for(int i = 0; i < intarr.length; i++) {
			strintarr += (i == 0) ? intarr[i] : ", "+intarr[i];

		}
		System.out.printf("배열 iArray = {%s}\n", strintarr);
		
		int min = 0;
		int max = 0;
		int temp = 0;
		for(int i = 0; i < intarr.length; i++) {
			for(int j = i+1; j < intarr.length; j++) {
				if(intarr[i] > intarr[j]) {
					temp = intarr[i];
					intarr[i] = intarr[j];
					intarr[j] = temp;
				}
			}
		}
		
		String afterintarr = "";
		for(int i = 0; i < intarr.length; i++) {
			afterintarr += (i == 0) ? intarr[i] : ", "+intarr[i];
		}

		System.out.printf("최소값 : {%d}\n최대값  {%d}\n오름차순 정렬 : {%s}", intarr[0], intarr[intarr.length-1], afterintarr);
	}
}
