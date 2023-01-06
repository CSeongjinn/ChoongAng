package jan06;

import java.util.Scanner;

public class AsciiN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==0||j==i||j==num-1)System.out.print("N");
				else System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
