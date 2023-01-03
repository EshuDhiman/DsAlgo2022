package Concepts.SerializationJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.hamcrest.core.IsInstanceOf;

// have to implement serializable interface , if not it will throw NotSerializableException
class Dog implements Serializable{
    int i=10;
    int j=20;
}

public class SerializationBasic {
    public static void main(String[] args) throws Exception{
        Dog objdDog = new Dog();
        //  can implement serialization concept by file outputstream and object outputstream
        
            try (FileOutputStream fos = new FileOutputStream("dog.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) { 
                oos.writeObject(objdDog);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            // deSerialization

            try {
                /*Note:
   We can Serialize any Number of Objects to the File, But in which Order we
   Serialized in the Same Order Only we have to De - Serialize.That is in Serialization
   the order of objects is important.
                               Dog d1 =new Dog();
                               Cat с1 1 = new Cat();
                               Rat r1 =new Rat();
                               FOS fos = new FOS("abc.ser");
                               OOS oos = new oos(fos);
                               oos.writeObject(d1);
                               oos.writeObject(c1);
                               oos.writeObject(r1);
                               FIS fis s = new FIS("abc.txt");
                               OIS ois = new OIS(fis);
                               Dog
                               Cat с2 = (Cat)ois.readObject();
                               Rat r2= (Rat)ois.readObject();
 */
/* */
                FileInputStream fileInputStream = new FileInputStream("dog.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                Dog d2 = (Dog)objectInputStream.readObject();
                System.out.println(d2.i+d2.j);

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        
    
        }
}
