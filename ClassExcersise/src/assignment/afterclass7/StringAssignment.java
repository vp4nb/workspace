package assignment.afterclass7;

import java.util.Scanner;

public class StringAssignment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=in.nextLine();
		System.out.println("Enter the String to replace:");
		String sToReplace=in.nextLine();
		System.out.println("Enter the String replacement String:");
		String sWithReplace=in.nextLine();
		System.out.println("Enter the character to find index:");
		char index=in.next().charAt(0);
		Count c=new Count();
		Reverse r=new Reverse();
		LetterRepeatCount lrc=new LetterRepeatCount();
		WordIndex wi=new WordIndex();
		System.out.println("words count:"+c.wordCount(s));
		System.out.println("length of String: "+s.length());
		System.out.println("single word count: "+c.singleWordCount(s));
		System.out.println("reverse of entire String: "+r.reverseString(s));
		System.out.println("reverse of each word in the String: "+r.reverseWords(s));
		System.out.println("replace a word in the String: \""+s.replace(sToReplace, sWithReplace)+"\"");
		System.out.println("letter at the center: "+lrc.centerLetter(s));
		System.out.println("index of letter 'j': "+s.indexOf(index));
		lrc.letterRepeted(s);
		lrc.nonDuplicateLetter(s);
		wi.indexofWords(s);
		System.out.println("upper case of String: "+s.toUpperCase());
		
		
	}

}
