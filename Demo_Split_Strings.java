
public class Demo_Split_Strings {

	public static void main(String args[]) {
		
		String s1 = " Maven , Java , TestNG , Selenium , Jira ";
		
		String [] str = s1.split(" , ",5 );
		
		for(String s : str) {
			System.out.println(s);
		}
	
		// split return type is : - array  	
		
	}
}
