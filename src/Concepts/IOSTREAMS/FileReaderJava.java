package Concepts.IOSTREAMS;

import java.io.FileReader;

/*FileReader

We can Use FileReader to Read Character Data from the File.
Constructors:

1) FileReader fr = new FileReader(String fName);

2) FileReader fr = new FileReader(File f);

Methods:

1) int read();

¢ It Attempts to Read Next Character from the File and Returns its Unicode Value.

+ If there is No Next Character then we will get -1.

+ As this Method Returns Unicode Value Compulsory at the Time of Printing we should Perform
Type - Casting.

FileReader fr = new FileReader("abc.txt");
int i= fr.read();
while (i != -1) {

‘System.out.printin( (char)i );
i= frread();

}
*/
public class FileReaderJava {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("ESHUDHIMAN.txt");
        int i = fr.read();
        while(i!=-1){
            System.out.println((char)i);
            i=fr.read(); 
        }

        
    }
    
}
