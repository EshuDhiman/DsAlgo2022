package Concepts;

import java.util.Arrays;

public class PassingInFun {
    public static void main(String[] args) {
        int [] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums); // passint nums array in change function
        System.out.println(Arrays.toString(nums));

        
    }
    static void change(int[] arr ){
        arr[0]=99; // the value of arr of 0th index will be changed to 99, object arr will be pointing to       values of num basically nums values will passed to arr so arr will point to the values of num {x,y,z},
        // arr= values of nums   
    }
}
