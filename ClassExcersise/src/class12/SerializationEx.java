package class12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) {
		String fileName="file123.txt";
		//System.out.println(System.getProperty("user.dir"));
		fileName=System.getProperty("user.dir")+File.separator+"src"+File.separator+"class12"+File.separator+fileName;
		
		WebSite wb=new WebSite();
		wb.setName("google");
		wb.setRank(1);
		wb.setPurpose("searching");
		
		try(FileOutputStream fos=new FileOutputStream(fileName);
		ObjectOutputStream oos=new ObjectOutputStream(fos)){
		oos.writeObject(wb);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
			}

}
