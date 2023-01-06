package coll;

public class KeyMaker {

	final static String PATTERN = "annna"
			+ "aaaaa"
			+ "aanan"
			+ "anana"
			+ "nnaan";
	public String makeKey() {
		StringBuffer key= new StringBuffer();
		for(int i=0;i<PATTERN.length();i++) {
			if(i>0&&i%5==0) key.append("-");
			switch(PATTERN.charAt(i)) {
			case 'a':
				key.append(alphabet());
				break;
			case 'n':
				key.append(number());
				break;
			}
			//if(i%5==4 && i!=PATTERN.length()-1) key+="-";
		}
		return key.toString();
	}
	
	private int number() {
		return (int) (Math.random()*10);
	}
	
	private char alphabet() {
		return (char)(Math.random()*26+65);
	}

	public static void main(String[] args) {
		int r = (int)(Math.random()*10); //0~9
//		System.out.println(r);
		
		char[] alpha = {'A','B','C','D','E','F','G','H','I','J',
				'K','L','M','N','O','P','Q','R','S','T','U',
				'V','W','X','Y','Z'};
		int ar=(int)(Math.random()*26); //A~Z
//		System.out.println(alpha[ar]);
		
		KeyMaker k = new KeyMaker();
		System.out.println(k.makeKey());
		
	}
}
