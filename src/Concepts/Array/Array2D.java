package Concepts.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    // int arr[] = new int[5];
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        // System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                   
                arr[row][col] = sc.nextInt(); 
                
            }

            
        }
        // System.out.println(Arrays.toString(arr));
        
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                   
                System.out.println(" " + arr[row][col]+ "");
                
            }
            System.out.println();

            
        }
     
        for (int i = 0; i < arr[i].length; i++) {
            
            System.out.println(Arrays.toString(arr[i]));
        }
        
        // System.out.println(arr[0][0]);
        sc.close();
    
    }
    
}
