package Questions.StringsQuestions;

import java.util.Arrays;

/*Given a string S of opening and closing brackets '(' and ')' only. The task is to find an equal point. An equal point is an index such that the number of closing brackets on right from that point must be equal to number of opening brackets before that point. 
 Input: str = "(())))("
Output: 4
Explanation:
After index 4, string splits into (())
and ))(. Number of opening brackets in the
first part is equal to number of closing
brackets in the second part.
*/
class Solution {
    public long countSub(String str) {
        // Your code goes here 
       long count =0;
       long length = str.length();
       long equalPoint = length/2;
       char[] arr = str.toCharArray();
       if (length%2!=0) {
        System.out.println(length%2);
        
       }
       if(length%2==0){
        count = length/2;
            
        


       }
       System.out.println(count);
       return count;
        
        
    }
}
public class Equal_point_in_a_string_of_brackets {

    public static void main(String[] args) {
        Solution objSolution = new Solution();
        String str="(())))";
        objSolution.countSub(str);
        
        
        
    }
}
