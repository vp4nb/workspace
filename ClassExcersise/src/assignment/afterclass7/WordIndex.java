package assignment.afterclass7;

public class WordIndex {
	Count c=new Count();
	Reverse r=new Reverse();
	public void indexofWords(String str)
	{
		int len=str.length();
		String str1="";
		int j=0;
		int count=c.wordCount(str);
		
		for(int i=0;i<len;i++)
		{
			if(count==1)
			{
				System.out.println("\nword: "+str.substring(j, len)+" \nbegin index is:"+j+"\nend index is:"+(len-1));str1=str1+" "+r.reverseString(str.substring(j, len));
				break;
			}
			if(str.codePointAt(i)==32)
			{
				System.out.println("\nword: "+str.substring(j, i)+" \nbegin index is:"+j+"\nend index is:"+(i-1));
				
				j=i+1;
				count--;
			}
		
		}
		System.out.println();
		
	}
}
