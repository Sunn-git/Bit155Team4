package KWC;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05_1 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intarr = {10, 21, 32, 43, 54, 65,76,87, 98, 109};
		String strintarr = "";
		for(int i = 0; i < intarr.length; i++) {
			strintarr += (i == 0) ? intarr[i] : ", "+intarr[i];
		}

		
		boolean isIncluded = false;
		
		System.out.printf("배열 = {%s}\n", strintarr);
		System.out.println("탐색할 값을 입력 하시오.");
		int value = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < intarr.length; i++) {
			if(intarr[i] == value) {
				isIncluded = true;
				System.out.println("탐색한 값은 "+(i+1)+"번째에 있습니다.");
			}
		}
		if(!isIncluded) {
			System.out.println("탐색할 값이 배열에 없습니다.");
		}
	}



}
