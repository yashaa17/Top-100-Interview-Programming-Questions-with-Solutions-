package _28_HexadecimalToDecimal;

public class Problem {
	
	public static int convert(String hex) {
		String digits="0123456789ABCDEF";
		hex=hex.toUpperCase();
		int val=0;
		
		for(int i=0;i<hex.length();i++) {
			char c=hex.charAt(i);
			int d=digits.indexOf(c);
			val=16*val+d;
		}
		return val;		
	}
	
	public static void main(String[] args) {
		String hex="c9";
		System.out.println(convert(hex));

	}

}
