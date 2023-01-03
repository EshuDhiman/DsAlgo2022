package Concepts.IOSTREAMS;

import java.io.FileWriter;

public class FileWriterJava {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("ESHUDHIMAN.txt",true); // append krne ke liye true krna h agr baar baar write krna h agr true na likha to wo append hone ki jgha overwrite ho jayega agr program run kre ham
        fw.write("ESHU DHIMAN IS SO GOOD");
        char[] ch ={'a','b','c'};
        fw.write(ch);
        fw.flush();

    }
}
