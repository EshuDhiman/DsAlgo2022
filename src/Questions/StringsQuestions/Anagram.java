package Questions.StringsQuestions;

import java.util.Arrays;
/*compare length of strings if equal then move to next step if not equal return false,convert given two strings into array using .ChartoArray(); then sort the array with Arrays.sort() and then compare every index of sorted arrays , if every index of sorted array 1 is not equal to index of sorted array 2 then return false otherwise true*/

public class Anagram {public static void main(String[] args) {
    String str1="geeksforgeeks";  
    String str2="forgeekrgeekq";  

    
    System.out.println(isAnagram(str1 , str2));
}

public static boolean isAnagram(String a,String b)
        {
            boolean bol=true;
            if(a.length()!=b.length()){
                return bol;
            }
            else{
                char[] str1 = a.toCharArray();
                char[] str2 = b.toCharArray();
                Arrays.sort(str1);
                Arrays.sort(str2);
                System.out.println(str1);
                System.out.println(str2);
                for(int i = 0; i<str1.length;i++){
                    if(str1[i]!=str2[i]){
                        bol = false;
                    
                    
                }
                
            }
        }
        return bol;
    }    
}

