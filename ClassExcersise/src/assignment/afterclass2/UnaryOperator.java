package assignment.afterclass2;

public class UnaryOperator {

	public static void main(String[] args) {
		int a=+1;  //unary +
		System.out.println("unary '+' value: "+a);
		a=-a;
		System.out.println("unary '-' value: "+a);
		System.out.println("unary '++a' value: "+(++a));  //first use the value then increment
		System.out.println("unary 'a++' value: "+(a++)); //first increment then use the result
		System.out.println("unary 'a--' value: "+(a--));  //first increment then use the result
		System.out.println("unary '--a' value: "+(--a));  //first use the value then increment
		boolean bool=false;
		System.out.println("boolean value: "+bool);
		bool=!bool; //change the boolean value from false to true and vice versa
		System.out.println("boolean value after '!' apply: "+bool);
		// TODO Auto-generated method stub

	}

}
