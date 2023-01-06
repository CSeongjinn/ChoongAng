package jan06;

import java.util.Scanner;

public class RunLength {
	public static void main(String[] args) {
		int count;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer zip = new StringBuffer();
		count = 1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i-1)==str.charAt(i)) {
				count++;
			}else {
				zip.append(str.charAt(i-1));
				zip.append(count);
				count=1;
			}
			if(i==str.length()-1) {
				zip.append(str.charAt(i));
				zip.append(count);
			}
		}
		System.out.println(zip);
		sc.close();
	}
}
