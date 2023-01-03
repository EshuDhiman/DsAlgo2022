package Questions.StringsQuestions;

public class N_equal_parts {
public static void main(String[] args) {
    String str = "454545";
    equalparts(str,2);
}

private static int equalparts(String str , int n) {
    if(str.length()%n!=0){
        return -1;  

    }
    else{
        int part = str.length()/n;
        System.out.println(part);
        int start=0;
        int end = str.length()-1;
        for (int i = 0; i < part; i++) {
            
        }



    }
    return 1;
}
    
}
