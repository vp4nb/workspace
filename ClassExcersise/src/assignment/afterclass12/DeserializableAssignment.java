package assignment.afterclass12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableAssignment {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		 ObjectInputStream oin = new ObjectInputStream(
                 new FileInputStream("output.bin"));
       
       Object ob1 = oin.readObject();
       Object ob2 = oin.readObject();
       Object ob3 = oin.readObject();
       
       System.out.println(ob1);
       System.out.println(ob2);
       System.out.println(ob3);
       
		// TODO Auto-generated method stub

	}

}
