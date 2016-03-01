package assignment.afterclass7;

public class LetterRepeatCount {
	public String centerLetter(String str)
	{
		String str1="";
		int len=str.length();
		if(len%2==0)
		{
			str1+=str.charAt((len/2)-1);
			str1+=str.charAt(len/2);
		}
		else
		{
			str1+=str.charAt(len/2);
		}
		return str1;
	}

	public void letterRepeted(String str)
	{
		int len=str.length();
		String str1;
		int count,j;
		System.out.println("\nnumber of times each letter repeted");
		for(int i=0;i<len;i++)
		{
			count=0;
			j=0;
			str1=str.substring(0,i+1);			
			if(str1.indexOf(str.charAt(i))==i)
			{
				str1=str.substring(i);	
				if(str1.indexOf(str.charAt(i))==0)
				{
					count++;
					while(j<len)
					{
						if(j!=len-1)
						{
						str1=str1.substring(j+1);
							if(str1.indexOf(str.charAt(i))==-1)
							{
								break;
							}
							else
							{
							count++;
							j=str1.indexOf(str.charAt(i));
							}
						}
						else
						{
							count++;
						}
					}
				}
				System.out.println("character: '"+str.charAt(i)+"' repeat count:"+count);
			}
		}
	}
	public void nonDuplicateLetter(String str)
	{
		System.out.print("\nnon repeted letters: ");
		for(int i=0;i<str.length();i++)
		{
			if((str.substring(0, i).indexOf(str.charAt(i))==-1)&&(str.substring(i+1).indexOf(str.charAt(i))==-1))
			{
				System.out.print("'"+str.charAt(i)+"' ");
			}
		}
	}
	
}
