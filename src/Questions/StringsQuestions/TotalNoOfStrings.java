package Questions.StringsQuestions;


public class TotalNoOfStrings{
    public static void main(String[] args) {
        String sr = "eq";
        // totalCount(sr);
        System.out.println(totalCount(sr));

        
    }
    static int totalCount(String sr){
        int total=0;
        
        for (int i = 0; i < sr.length(); i++) {
            if (sr.charAt(i)!=' ') {
                total+=1;
            }
            
            
        }
        return total;
        

    }
}