package coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Set02 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("홍길서");
		set.add("홍길남");
		set.add("홍길북");
		set.add("홍길중");
		set.add("홍길좌");
		set.add("홍길우");
		
		System.out.println(set.size());
		System.out.println(set);
		
		//List
		List<String> list = new ArrayList<String>(set);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		for(String str:list) {
			System.out.println(str);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
