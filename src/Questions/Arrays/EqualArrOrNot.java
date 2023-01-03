package Questions.Arrays;

import java.util.Arrays;

public class EqualArrOrNot {
    public static void main(String[] args) {
        
    }
    public static boolean check(long A[],long B[],int N)
    {    
         
        int count=0;
        if(A.length==B.length){
        for(int i=0;i<N;i++){
            if(Arrays.sort(A[i])=+Arrays.sort(B[i])){
                
                count+=1;
            }
            
        }
        }
        else{
            return 0;
        }
        if(count==n){
            return 1;
        }
    }
}
