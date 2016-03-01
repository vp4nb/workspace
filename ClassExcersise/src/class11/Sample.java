package class11;

public class Sample {

	public static void main(String[] args) {
		int myArray[]={1,2,3,4,5};
		ChangeIt.doIt(myArray);
		for(int i=0;i<myArray.length;i++)
		{
			System.out.println(myArray[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}

class ChangeIt
{
	static void doIt(int[] z)
	{
		int[] A=z;
		A[0]=99;
	}
}
