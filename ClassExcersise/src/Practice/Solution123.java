package Practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution123 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input=in.nextLine();
		int num=in.nextInt();
		String[] words=new String[num];
		for(int i=0;i<num;i++){
			words[i]=in.next();
		}
		StringTokenizer st = new StringTokenizer(input,".");
		String wordString="";
		while(st.hasMoreTokens()){
			wordString+=st.nextToken();
		}
		st = new StringTokenizer(wordString," ");
		int count=st.countTokens();
		String[] strWords=new String[count];
		int start=0;
		while(st.hasMoreTokens()){
			strWords[start++]=st.nextToken();
		}
		String strCompare;
		for(int i=0;i<count;i++){
			strCompare=strWords[i];
			for(int j=0;j<num;j++){
				if(strCompare.equalsIgnoreCase(words[j])){
					
				}
			}
			
			System.out.println(strCompare);
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
