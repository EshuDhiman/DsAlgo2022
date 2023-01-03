package Questions.StringsQuestions;
/*Given two strings of lowercase English letters, AA and BB, perform the following operations:

Sum the lengths of AA and BB.
Determine if AA is lexicographically larger than BB (i.e.: does BB come before AA in the dictionary?).
Capitalize the first letter in AA and BB and print them on a single line, separated by a space.
Input Format

Two strings, the first being AA and the second being BB. They are comprised of lowercase English letters (no symbols or spaces) and may not be on the same line.

Output Format

There are three lines of output: 
For the first line, sum the lengths of AA and BB. 
For the second line, write Yes if AA is lexicographically larger than BB or No if it is not. 
For the third line, capitalize the first letter in both AA and BB and print them on a single line, separated by a space.

Sample Input

 hello
 java
Sample Output

9
No
Hello Java
Explanation

String AA is "hello" and BB is "java". 
AA has a length of 55, and BB has a length of 44; the sum of their lengths is 99. 
When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore, AA is not larger than BB and the answer is NO. 
When you capitalize the first letter of both AA and BB and then print them separated by a space, you get "Hello Java". */

import java.util.Arrays;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "java";
        operations(str, str2);
    }
    public static void operations(String str, String str2){
        char[] charStr = str.toCharArray();
        char[] charStr2 = str2.toCharArray();
        int count = 0;
        int count2=0;
        for (int i = 0; i < charStr.length; i++) {
            count+=1;
            
        }
        
        for (int i = 0; i < charStr2.length; i++) {
            count2+=1;
        }
        System.out.println(count+count2);
        int i=0;
        while(i!=1){
            if (charStr[i]<charStr2[i]) {
                System.out.println("yes");

                
            }
            else{System.out.println("no");
            }
            
            i+=1;
        }
        String atemp = str.substring(0,1).toUpperCase()+str.substring(1);
        String btemp = str2.substring(0, 1).toUpperCase()+str2.substring(1,count2);
        System.out.println(atemp + " " + btemp);
        
        
        
        

    }    
}
