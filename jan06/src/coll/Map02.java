package coll;

import java.util.*;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
/*
 * List : 중복 허용하고, 순서가 있음
 * Set :중복허용 안하고 ,순서도 없음
 * Map : Key-Value로 저장하고, key는 순서/중복이 없음
 */

//map (p746)
public class Map02 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		
		map.put("poseidon", "0123456");
		map.put("zeus", "01234567");
		map.put("europe", "012345678");
		map.put("aphrodite", "0123456789");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 :");
			String id = sc.nextLine();
			
			System.out.print("비밀번호 :");
			String pw = sc.nextLine();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
		sc.close();
	}
}
