package Questions.StringsQuestions;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Geeks";
        reverseWord(s);
        
    }
    public static String reverseWord(String str)
    {   String revStr=null;
        char[] ch = new char[str.length()];
        ch= str.toCharArray();
        // System.out.println(Arrays.toString(ch));
        char[] ch2 = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            ch2[i]=ch[(ch.length)-(i+1)];
            
        }
        for (int i = 0; i < ch2.length; i++) {
            revStr= String.valueOf(ch2);
        }
        // System.out.println(revStr);

        return revStr;
    }

    
}
