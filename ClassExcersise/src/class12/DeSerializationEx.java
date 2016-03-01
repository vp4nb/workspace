package class12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializationEx {

	public static void main(String[] args) {
		
		String fileName="file123.txt";
		//System.out.println(System.getProperty("user.dir"));
		fileName=System.getProperty("user.dir")+File.separator+"src"+File.separator+"class12"+File.separator+fileName;
		
		WebSite w1=new WebSite();
		try(FileInputStream fis=new FileInputStream(fileName);
				ObjectInputStream ois=new ObjectInputStream(fis)){
				w1=(WebSite)ois.readObject();
				System.out.println(w1.getName());
				System.out.println(w1.getRank());
				System.out.println(w1.getPurpose());
				}
				catch(IOException | ClassNotFoundException e)
				{
					e.printStackTrace();
				}
		// TODO Auto-generated method stub

	}

}
