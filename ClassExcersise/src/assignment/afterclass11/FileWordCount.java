package assignment.afterclass11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import assignment.afterclass7.Count;

public class FileWordCount {

	public static void main(String[] args) throws IOException {
		
		String fileName="file234.txt";
		System.out.println(System.getProperty("user.dir"));
		fileName=System.getProperty("user.dir")+File.separator+"src"+File.separator+"assignment"+File.separator+"afterclass11"+File.separator+fileName;
		File fp1=new File(fileName);
		fp1.createNewFile();
		FileReader fr=new FileReader(fileName);
		BufferedReader br=new BufferedReader(fr);
		String line,totString="";
		while((line=br.readLine())!=null)
			totString=totString+line;
		System.out.println(totString);
		Count c=new Count();
		System.out.println(c.wordCount(totString));
		totString=totString.replace("awesome", "legend... wait for it...dary");
		
		if(fp1.exists())
		{
		FileOutputStream fos=new FileOutputStream(fileName,true);
		
		
		fos.write(totString.getBytes());
		fos.flush();
		
		}
		else
		{
			fp1.createNewFile();
		}
		// TODO Auto-generated method stub

	}

}
