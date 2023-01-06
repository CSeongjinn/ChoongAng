package jan06;

import java.util.Scanner;

public class Fraud {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터가 "+1+"을(를) 선언합니다");
		System.out.println("컴퓨터가 "+2+"을(를) 선언합니다");
		String usr;
		while(true) {
			usr = sc.nextLine();
			String[] ussr = usr.split(" ");
			for(int i=1;i<=4-ussr.length;i++){
				System.out.println("컴퓨터가 "+(Integer.parseInt(ussr[ussr.length-1])+i)+"을(를) 선언합니다");
			}
			if(ussr[0].equals("27")) {
				System.out.println("컴퓨터가 이김"); 
				break;
			}
		}
		sc.close();
	}
}
