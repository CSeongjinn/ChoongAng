package coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Map<K,V> : Key 중복X, Value 중복가능
public class Map01 {
	public static void main(String[] args) {
		//E,T,K,V,
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		//저장 put(K,V)
		map.put("홍길동", 12);
		map.put("홍길서", 30);
		map.put("홍길남", 20);
		map.put("홍길북", 10);
		map.put("홍길중", 50);
		map.put("홍길동", 100); //K중복시 새로 입력한걸로 바뀐다
		
		System.out.println(map);
		
		Map<String, String> map2 = new HashMap<String,String>();
		map2.put("홍길동", "동");
		map2.put("홍길서", "서");
		map2.put("홍길남", "북");
		map2.put("홍길북", "남");
		map2.put("홍길좌", "상");
		map2.put("홍길우", "하");

		//get(K)
		System.out.println(map.get("홍길중"));
		System.out.println(map.get("없는거"));
		System.out.println(map2.get("홍길남"));
		
		//있는지 물어보기
		System.out.println(map.containsKey("홍길서"));
		System.out.println(map.containsKey("백길서"));
		
		System.out.println(map.containsValue(30));
		System.out.println(map2.containsValue("30"));
		
		//지우기 remove(K)
		//map.remove("홍길동");
		System.out.println(map.remove("홍길동"));//K에 있던 V값을 반환
		System.out.println(map);
		
		System.out.println(map.size());
		
		//1. map -> set -> list
		//Set<String> map2set = map2.keySet();
		//System.out.println(map2set);
		List<String> set2List = new ArrayList<String>(map.keySet());
		System.out.println(set2List);
		for(int i=0;i<set2List.size();i++) {
			System.out.print("K:"+set2List.get(i));
			Integer value = map.get(set2List.get(i));
			System.out.println(",V:"+value);
		}
		List<String> set2List2 = new ArrayList<String>(map2.keySet());
		for(int i=0;i<set2List2.size();i++) {
			System.out.print("K:"+set2List2.get(i));
			String value = map2.get(set2List2.get(i));
			System.out.println(",V:"+value);
		}
		//2. map -> set === iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.print("K:"+key);
			System.out.println(",V:"+map.get(key));
		}
	}
}
