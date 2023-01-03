package Concepts.IOSTREAMS;
/*java.io Package
      1)File
      2)FileWriter
      3)FileReader
      4)BufferedWriter
      5)BufferedReader
      6)PrintWriter
      * This Line won't Create any Physical File, First it will Check is there any Physical
File Already Available with abc.txt Name OR Not.
If it is Already Available then f pointing to that File.
If it is Not Already Available this Line won't Create any Physical File and just it
Creates a Java File Object to Represent the Name abc.txt.
File f = new File("abc.txt"); 

System.out.printin(f.exists()); //false

System.out.printin(f.exists()); //true
abc.txt
eWecan Use Java File Object to Represent Directory Also.

File f = new File("durga123");

System.out.printin(f.exists()); //false
f.mkdir(); f ——+
System.out.printin(f.exists()); //true

1) File f = new File(String name);

Creates a Java File Object to Represent Name of specified File OR Directory
Present in Current Working Directory.

2) File f = new File(String subdir, String name);

Creates a Java File Object to Represent Name of the File OR Directory
Present in specifie Directory.

3) File f = new File(File subdir, String name);


      
 */

import java.io.File;
import java.io.FileWriter;

public class FileIOStream {
    public static void main(String[] args) throws Exception{
      File f = new File("ESHUDHIMANFILE.txt");
      f.createNewFile(); // created file in current dir
      File f2 = new File("DEMO","DEMO.txt"); // created file in the sub dir 
      f2.createNewFile();
      
        
    }

}
 