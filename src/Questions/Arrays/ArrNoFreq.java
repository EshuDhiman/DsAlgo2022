package Questions.Arrays;

import java.util.Arrays;

public class ArrNoFreq {
    public static void main(String[] args) {
        int[] arr ={0,5,5,5,4};
        frequencyCount(arr , 1);
        
    }
    public static void frequencyCount(int arr[], int n)
    {   int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n) {
               count+=1; 
                
            }

        }
        System.out.println(count);
    }
}
