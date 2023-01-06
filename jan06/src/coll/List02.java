package coll;

import java.util.*;

//List + Map
public class List02 {
	public static void main(String[] args) {
		//외부
		List<Map<String, Object>> board = new ArrayList<Map<String,Object>>();
		//실제 데이터 저장
		Map<String,Object> ele = new HashMap<String,Object>();
		//data
		ele.put("no", 5);
		ele.put("title", "제목입니다");
		ele.put("writer", "poseidon");
		ele.put("date", "2023-01-05");
		board.add(ele); //리스트에 붙이기
		
		ele = new HashMap<>(); //같은 이름의 새로운 객체
		ele.put("no", 6);
		ele.put("title", "집에가고싶어요");
		ele.put("writer", "가나다라마법사");
		ele.put("date", "2023-01-06");
		board.add(ele); //리스트에 붙이기

		ele = new HashMap<>(); //같은 이름의 새로운 객체
		ele.put("no", 7);
		ele.put("title", "아이에에에에");
		ele.put("writer", "닌자슬레이어");
		ele.put("date", "2023-01-06");
		board.add(ele); //리스트에 붙이기
		
		ele = new HashMap<>(); //같은 이름의 새로운 객체
		ele.put("no", 8);
		ele.put("title", "길어지는그림자");
		ele.put("writer", "가나다라마법사");
		ele.put("date", "2023-01-07");
		board.add(ele); //리스트에 붙이기
		
		ele = new HashMap<>(); //같은 이름의 새로운 객체
		ele.put("no", 9);
		ele.put("title", "야근하면볼수없");
		ele.put("writer", "가나다라마법사");
		ele.put("date", "2023-01-07");
		board.add(ele); //리스트에 붙이기
		
		System.out.println(board);
//		[{date=2023-01-05, no=5, writer=poseidon, title=제목입니다},
//		{date=2023-01-06, no=6, writer=가나다라마법사, title=집에가고싶어요},
//		{date=2023-01-06, no=7, writer=닌자슬레이어, title=아이에에에에},
//		{date=2023-01-06, no=8, writer=가나다라마법사, title=길어지는그림자},
//		{date=2023-01-06, no=9, writer=가나다라마법사, title=야근하면볼수없지}]
		
		System.out.println("번호\t제목\t\t글쓴이\t\t날짜");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		for (int i = 0; i < board.size(); i++) {
			System.out.print(board.get(i).get("no")+"\t");
			System.out.print(board.get(i).get("title")+"\t");
			System.out.print(board.get(i).get("writer")+"\t");
			System.out.print(board.get(i).get("date")+"\n");
		}
		
		//call by value? call by reference?
	}	
}
