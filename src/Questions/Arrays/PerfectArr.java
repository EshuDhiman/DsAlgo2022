package Questions.Arrays;

import java.util.Arrays;

// Given an array of size N and you have to tell whether the array is perfect or not. An array is said to be perfect if it's reverse array matches the original array. If the array is perfect then print "PERFECT" else print "NOT PERFECT".
public class PerfectArr {
    public static void main(String[] args) {
        int[] arr= {1,2,3,2,1};
        int n= 5;
        IsPerfect(arr, n);
    }
    public static boolean IsPerfect(int a[], int n)
    {   int arr[] = new int[n];
        int count = 0;
        
        for(int i=n-1,k=0;i<arr.length;i--,k++){
            if(i>=0){
                
            arr[k]=a[i];

            }
            else{
                break ;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]==a[j]){
                count+=1;
            }

        }
        if(count==n){
            System.out.println("P");
            return true;
        }
        else{
            System.out.println("NP");
            return false;
        }
        
    }
    
}
