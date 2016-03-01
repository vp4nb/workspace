package assignment.afterclass7;

public class Count {
	public int wordCount(String str)
	{
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(str.codePointAt(i)==32&&i>0&&str.codePointBefore(i)!=32)
			{
				count++;
			}
		}
		return count+1;
	}
	public int singleWordCount(String str)
	{
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(str.codePointAt(i)==32&&((i-1)==0||str.codePointBefore(i-1)==32))
			{
				count++;
			}
		}
		return count;
	}
	

}
