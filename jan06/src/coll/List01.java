package coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List : 순서가 있다. 중복허용
//Set : 순서가 없다. 중복불허
//Map : 순서가 없다. 중복불허
//		<Key,Value>형태로 저장
public class List01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		//add(E):뒤에 추가
		//add(index,E):index에 추가
		list.add(150);
		System.out.println(list.size());//크기
		
		//remove(index); index에 있는 값 삭제
		//clear();
		
		//set(index,E); index에 있는 값을 E로 교체
		int count = list.indexOf(150);//E가 있는 index
		System.out.println(count);
		
		System.out.println(list.contains(150));//E의 존재 여부
		System.out.println(list.contains(50));
		
		Integer value = list.get(0);//index에 있는 값
		System.out.println(value);
		
		System.out.println(list.isEmpty()); //list가 비어있는지
		
		//[150,1,2,3,4,5,6,7,8,9,10]
		for(int i=1;i<=10;i++) list.add(i);
		System.out.println(list);
		
		//iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//객체.hasNext() 해당 iteration이 다음 요소를 가지고 있으면
		//true, 없으면 false
		
		//객체.next() 다음 요소를 반환
		
		List<String> key = new ArrayList<String>();
		key.add("123-456-789");
		key.add("321-654-987");
		key.add("555-555-555");
		System.out.println(key);
		
	}
}
