package class12;

public class GenericsEx {

	public static void main(String[] args) {
		int n=10;
		int[] a=new int[4];
		a[0]=1;a[1]=2;a[2]=3;a[3]=4;
		String value="only String";
		Baskets<Integer> integer=new Baskets<>();
		integer.setA(n);
		integer.setSize(4);
		for(int i=0;i<4;i++)
		integer.setArr(i);
		
		for(int i=0;i<4;i++)
		{
			System.out.println(integer.getArr(i));
		}
		
		
		Baskets<Double> d=new Baskets<>();
		d.setA(10.5);
		d.setSize(4);
		for(int i=0;i<4;i++)
		d.setArr(10.6+i);
		
		for(int i=0;i<4;i++)
		{
			System.out.println(d.getArr(i));
		}
		
		Baskets<String> string=new Baskets<>();
		string.setA(value);
		
		System.out.println(integer.getA());
		System.out.println(string.getA());
		// TODO Auto-generated method stub

	}

}
class Baskets<T>
{	
	private T a;
	private T Arr[];
	private T size;
	public T getArr(int val) {
		return Arr[val];
	}

	public void setArr(T arr) {
		Arr[index] = arr;
		index++;
	}
	

	int index=0;


	public void setSize(int size) {
		
		Arr=(T[])new Object[size];
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
}

