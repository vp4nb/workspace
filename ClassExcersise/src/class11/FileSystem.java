package class11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSystem {

	public static void main(String[] args) {
		//creating the file
		File fp=new File("C:\\Users\\venka\\Desktop\\workspace\\ClassExcersise\\src\\class11\\files.txt");
		
			try {
				fp.createNewFile();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		
		
		String fileName="file234.txt";
		System.out.println(System.getProperty("user.dir"));
		fileName=System.getProperty("user.dir")+File.separator+"src"+File.separator+"class11"+File.separator+fileName;
		File fp1=new File(fileName);
		try {
			fp1.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		//read data
		
		try(FileInputStream fis=new FileInputStream(fp);
		//BufferedInputStream bis=new BufferedInputStream (fis);
		DataInputStream dis=new DataInputStream (fis);){
		while(dis.available()!=0)
		System.out.println(dis.readLine());
		
		

		//to write
		String str="its going to be legend...... wait for it .... dary\n";
		if(fp.exists())
		{
		FileOutputStream fos=new FileOutputStream(fileName,true);
		
		
		fos.write(str.getBytes());
		fos.flush();
		
		}
		else
		{
			fp.createNewFile();
		}
		
		//to read in other way
		FileReader fr=new FileReader(fileName);
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		System.out.println(line);
		
		
		
		 str="wooo woooo woooo ";
		FileWriter fw=new FileWriter(fileName,true);
		BufferedWriter bw=new BufferedWriter(fw);
				bw.write(str);
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
