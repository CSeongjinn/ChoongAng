package jan06;

public class Morning {
	public static void main(String[] args) {
		
		//1~10000까지 8이 몇번 나오는가
		int count = 0;
		for(int i=1;i<=10000;i++) {
			if(i%10==8) count++;
		}
		System.out.println(count*4);
		
		
//		[[1,2,3,4,5,6,7,8,9,10],
//		 [10,20,30,40,50,60,70,80,90,100],
//		 [100,200,300,400,500,600,700,800,900,1000]]
		int[][] arr = new int[3][10];
		for(int i=0;i<3;i++) {
			for(int j=0;j<10;j++) {
				arr[i][j]=(int) (Math.pow(10,i)*(j+1));
			}
		}
		System.out.print("[");
		for(int i=0;i<3;i++) {
			System.out.print("[");
			for(int j=0;j<10;j++) {
				System.out.print(arr[i][j]);
				if(j!=9)	System.out.print(",");			
			}
			System.out.print("]");
			if(i!=2)System.out.println(",");
		}
		System.out.println("]");
	}
}
