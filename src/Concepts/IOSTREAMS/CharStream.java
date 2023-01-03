package Concepts.IOSTREAMS;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class CharStream {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("teSTCoPY.txt");
        FileWriter writer = new FileWriter("charcopy.txt");
        int contetnt;
        while((contetnt=reader.read())!=-1){
            writer.append((char)(contetnt));

        }
        reader.close();
        writer.close();

    }
    
}
