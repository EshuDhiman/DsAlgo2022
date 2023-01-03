package Questions.Arrays;

import java.util.Arrays;

public class FeqOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,8,3,2,2,5,1};
        calFreq(arr);
        
    }
    static void calFreq(int arr[]){
        int n=0;
        int count=0;
        int[] arrFreq= new int[arr.length];
        Arrays.sort(arr);
        int i=0;
        while(i<arr.length){
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]==n) {
                    count+=1;
                  
                }
                n+=1;
                
            
        }
        i=i+1;
        }
        System.out.println(Arrays.toString(arrFreq));
    
}

}
