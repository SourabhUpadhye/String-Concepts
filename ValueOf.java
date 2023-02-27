
public class ValueOf {

	public static void main(String[] args) {
		
		double premium = 998878.96;
		int empid = 12473;
		char chay = 'C';
		long mb = 43282688427689l;
		boolean t = true;
		
		String p = String.valueOf(premium);
		System.out.println(p);
		
		String e = String.valueOf(empid);
		System.out.println(e);
		
		String s = String.valueOf(chay);
		System.out.println(s);
		
		String l = String.valueOf(mb);
		System.out.println(l);
		
		String b = String.valueOf(t);
		System.out.println(t);
	}
}
