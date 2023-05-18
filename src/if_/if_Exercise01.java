package if_;

import java.util.Scanner;

public class if_Exercise01 {
	
	public static void main(String[] args) {
		
		/*
		 A와 B를 비교하여 작은 값 출력
		 */
		Scanner sc = new Scanner(System.in);
		int A, B, min;
		System.out.println("A와 B를 비교해 작은값 출력하시오");
		System.out.print("A의 값 : ");
		A = sc.nextInt();
		System.out.print("B의 값 : ");
		B = sc.nextInt();
		
		if(A>B) {
			min = B;
		}
		else {
			min = A;
		}
		
		System.out.println("최소값은 " + min + "입니다.");
		
		
		
	}
	

	
	
	

}
