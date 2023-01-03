package Questions.StringsQuestions;

public class TotalNoOfPanctuations {
    public static void main(String[] args) {
        String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
        System.out.println(countTotalNoOfPanctuations(str)); 
    }

    private static int countTotalNoOfPanctuations(String sr) {
        int count=0;
        for (int index = 0; index < sr.length(); index++) {
            if(sr.charAt(index) == '!' || sr.charAt(index) == ',' || sr.charAt(index) == ';' || sr.charAt(index) == '.' ||  sr.charAt(index) == '?' || sr.charAt(index) == '-' ||    
            sr.charAt(index) == '\'' || sr.charAt(index) == '\"' || sr.charAt(index) == ':'){
                count+=1;
            }   
            
        }
        return count;
    }
}
