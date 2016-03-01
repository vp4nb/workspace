package assignment.afterclass8;

public class DimentionMultiplication {
	public void multipleTable2Dimention(int num)
	{
		System.out.println("2 dimention table");
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}
	public void multipleTable3Dimention(int num)
	{
		System.out.println("3 dimention table");
		for(int i=1;i<num;i++)
		{
			for(int j=1;j<=10;j++)
			{
			System.out.println("1"+"*"+i+"*"+j+"="+(1*i*j));
			}
			System.out.println();
		}
	}

}
