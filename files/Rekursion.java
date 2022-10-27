public class Rekursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		permute("", "abc");

	}
	
	public static void permute(String cur, String rest) {
		
		if (rest.length() == 0) {
			System.out.println(cur);
			return;
		}
		
		for (int i = 0; i < rest.length(); i++) {
			char a = rest.charAt(i);
			String curNew = cur + a;
			String restNew = rest.substring(0, i) + rest.substring(i+1, rest.length());
			permute(curNew, restNew);
		}
				
		
	}

}
