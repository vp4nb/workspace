package class7;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Not immutable";
	      String str2 = "Strings are immutable";
	      //StringBuffer str3 = new StringBuffer( "Not immutable");
	      String str3="not immutable";
	      boolean  result = str1.equalsIgnoreCase( str3 );
	      System.out.println(result);
		  
	      result = str2.equals( str3 );
	      System.out.println(result);

	}

}
