package jan06;

import java.util.Iterator;

public class Thing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
//		System.out.println(a+","+b);
		swap(a,b);
//		System.out.println(a+","+b);
		
		Car c1 = new Car();
		Car c2 = new Car();
		c1.name ="a";
		c2.name ="b";
		System.out.println(c1.name+","+c2.name);
		System.out.println(swap(c1,c2).name);
		System.out.println(c1.name+","+c2.name);
		

	}

	public static void swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;				
	}
	public static Car swap(Car a,Car b) {
		Car temp;
		temp = a;
		a = b;
		b = temp;
		
		return a;
	}

}

class Car{
	String name;
}
