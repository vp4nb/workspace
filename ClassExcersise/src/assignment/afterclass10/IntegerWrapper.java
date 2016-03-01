package assignment.afterclass10;

public class IntegerWrapper {

	public static void main(String[] args) {
		
		int varA=10;
		Integer refA=new Integer(varA);
		System.out.println(refA.toString());
		
		System.out.println(refA.floatValue());
		
		System.out.println(refA.toHexString(varA));
		// TODO Auto-generated method stub

	}

}
