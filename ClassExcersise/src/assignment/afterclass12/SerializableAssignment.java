package assignment.afterclass12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import class12.WebSite;

public class SerializableAssignment {

     /**
      * @param args
      */
     public static void main(String[] args) {
          // TODO Auto-generated method stub
         WebSite o1 = new WebSite();
         WebSite o2 = new WebSite();
         WebSite o3 = new WebSite();
     
          try {
               ObjectOutputStream oout = new ObjectOutputStream(
                         new FileOutputStream("output.bin"));
               
               oout.writeObject(o1);
               oout.writeObject(o2);
               oout.writeObject(o3);
               oout.flush();
               oout.close();
               
              
          } catch (Exception exc){ 
               exc.printStackTrace();
          }
     }
}

