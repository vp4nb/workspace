package Class2;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a=14,b=5;
		int c=a&b, d=a|b, e=a^b, f=a<<1,g=b>>1;
		System.out.println("given values are:"+a+" "+b);
		System.out.println("bitwise And: "+c);
		System.out.println("bitwise OR: "+d);
		System.out.println("bitwise exclisive OR: "+e);
		System.out.println("left shift: "+f);
		System.out.println("right shift: "+g);

	}

}
