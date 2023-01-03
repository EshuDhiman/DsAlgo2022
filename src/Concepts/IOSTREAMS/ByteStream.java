package Concepts.IOSTREAMS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
   public static void main(String[] args) throws IOException {
     // BYTE STREAMS
     FileInputStream fis = null;
     FileOutputStream fos = null;
     try {
        fis = new FileInputStream("E:\\vsCodeWorkspace\\DsAlgo2022\\src\\TEST.txt");
        fos = new FileOutputStream("teSTCoPY.txt");
        int content;
        while ((content=fis.read())!=-1) {
            fos.write((byte)(content));
            
        }
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    finally{
        if(fis!=null){
            fis.close();
        }
        if(fos!=null){
            fos.close();
        }
    }
   }


    
}
