package Questions.StringsQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveVowelAndDisplay {
    public static void main(String[] args) {
        String str="university";
        display(str);    
    }

    private static void display(String str) {
        
        char[] stringTemp = str.toCharArray();
        String tempstr=str; 
        for(int i =0; i<str.length();i++){
            
            if(stringTemp[i]!='a'||stringTemp[i]!='e'||stringTemp[i]!='i'||stringTemp[i]!='o'||stringTemp[i]!='u'){
                System.out.print(stringTemp[i]);
                
                
            }
            // {System.out.println(tempstr = str.substring(i));}
            
        }
        
    }

    

    
}
