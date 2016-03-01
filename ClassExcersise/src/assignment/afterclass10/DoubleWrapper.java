package assignment.afterclass10;

public class DoubleWrapper {

	public static void main(String[] args) {
		
		double varA=10;
		Double refA=new Double(varA);
		System.out.println(refA.toString());
		
		System.out.println(refA.floatValue());
		
		System.out.println(refA.toHexString(varA));
		// TODO Auto-generated method stub

	}

}
