package coll;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//Set interface
//순서가 없다 중복도 없다
public class Set01 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(9);
		set.add(9);
		set.add(10);
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.remove(10));
		for(Integer integer : set) {
			System.out.println(integer);
		}
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer integer = (Integer)it.next();
			System.out.println(integer);
		}
		
		//lotto
		Set<Integer> lotto = new HashSet<Integer>();
		while(lotto.size()<6) {
			lotto.add((int)(Math.random()*45+1));
		}
		System.out.println(lotto);
		
	}

}
