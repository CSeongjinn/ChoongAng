package str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//스트링 문자열 String
public class Str01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "100";
		String str2 = new String("100");
		
		char ch = 'A';
		str = str+ch+150; //연결
		
		System.out.println(str);
		
		int num = 100+150; //계산
		
		str2 = "A"+127; 
		//문자 + 숫자 = 문자
		//문자 + 문자 = 문자
		//숫자 + 문자 = 문자
		//숫자 + 숫자 = 숫자
		//str2 = 'A'+127; 'A'가 숫자로 인식되어 계산이 일어남
		System.out.println(str2);
		
		str2 = 1+2+4+"A"; //7A
		str2 = "2"+1+2+4+"A"; //2124A
		str2 = "2"+(1+2+4)+"A"; //27A
		System.out.println(str2);
		
		str2 = "안녕하세요";
		char[] hi = str2.toCharArray();
		System.out.println(Arrays.toString(hi));
		
		for (int i = 0; i < str2.length(); i++) {
			System.out.println(str2.charAt(i));
		}
		System.out.println(str2.indexOf("안"));
		System.out.println(str2.indexOf("가"));
		
		List<String> hiList = Arrays.asList(str2);
		System.out.println(hiList);
		
		String str3 = new String(hi,1,2);
		System.out.println(str3);
		
		str3 = "kjgerjogermjvkleamoavprvjiojvoaiejvioajeviojaeopjiogajoigjaopejgojeaoirvjerjpg";
		System.out.println("j가 몇 개?");
		int cnt=0;
		for(int i =0; i<str3.length();i++) {
			if(str3.charAt(i)=='j') {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		str3 = "Hi5";
		System.out.println(Character.isAlphabetic('A'));
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('A'));

		System.out.println(str3.contains("고양이"));
		System.out.println(str3.contains("Hi"));
		
		str3 = str3.concat("입니다.");
		System.out.println(str3);
		System.out.println(str3.endsWith("니다."));
		String email = "1230pf@gmail.com";
		System.out.println(email.endsWith("com"));
		
		String str1 = new String("Hi");
		str2 = new String("Hi");
		//str1 = "Hi"; str2 = "Hi";로 하면 str1==str2 가 true지만
		//위처럼 생성하면 false
		//r타입에선 ==을 사용하지말자
		
		System.out.println(str1==str2);
		//불변성, immortal
		System.out.println(str1.equals(str2));
		
		str1="안녕하세요";
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append("날씨가 참 좋네요");
		sb.append("하하하하...");
		System.out.println(sb.toString());
		
		System.out.println(email.indexOf("@"));
		
		String id = email.substring(0,email.indexOf("@"));
		System.out.println(id);
		String server = email.substring(email.indexOf("@")+1,email.length());
		System.out.println(server);
	}

}
