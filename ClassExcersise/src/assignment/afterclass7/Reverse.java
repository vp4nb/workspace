package assignment.afterclass7;

public class Reverse {
	Count c=new Count();
	public String reverseString(String str)
	{
		int len=str.length();
		String str1="";
		for(int j=len-1;j>=0;j--)
		{
			str1+=str.charAt(j);
		}
		return str1;
	}
	public String reverseWords(String str)
	{
		int len=str.length();
		String str1="";
		int j=0;
		int count=c.wordCount(str);
		for(int i=0;i<len;i++)
		{
			if(count==1)
			{
				str1=str1+" "+reverseString(str.substring(j, len));
				break;
			}
			if(str.codePointAt(i)==32)
			{
				str1=str1+" "+reverseString(str.substring(j, i));
				j=i+1;
				count--;
			}
		
		}
		return str1;
	}

}
