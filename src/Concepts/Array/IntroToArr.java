package Concepts.Array;

import java.util.Arrays;
import java.util.Scanner;

public class IntroToArr {
    int arr[] = {1,2,3,4};
    // data type[] varname = new datatype[size];
    int[] arrA = new int[5]; //primitve type
    Scanner sc = new Scanner(System.in);
    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int k = 0; k < arr.length; k++) {

            arrA[k] = sc.nextInt();
        }
        // for (int k = 0; k < arr.length; k++) {

        //     System.out.println(arrA[k]);
        // }
       
          System.out.println(Arrays.toString(arrA));
    }
    public void tryingString() {
        String str[] = new String[5]; //refrence type
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(str));        
    }
    
   
    

    
}
