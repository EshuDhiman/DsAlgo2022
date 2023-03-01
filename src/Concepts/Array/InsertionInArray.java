package Concepts.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class InsertionInArray{
    public static void main(String[] args) {
        int initialSize = 5; // array of capacity to hold 5 elements
        int arr[] = new int[initialSize];
       arr[0] = 5;
       arr[1] = 7;
       arr[2] = 10;
       arr[3] = 20;
       int size = 4; // size of the array is number of elements in array
       addAtPostion(4, arr, initialSize,size, 100);
    //    addAtPostion(5, arr, initialSize,size, 100);
       System.out.println(Arrays.toString(arr));
    }
    static int addAtPostion(int psotion , int[] arr, int initialSize , int size, int element ){
        if(initialSize==size){
            // if initial size = size ie 5=5 there is no capacity left to hold items so it will return size code will end here
            return size;
        }
        int index = psotion-1; // user is entering the postion of array but to add element at that particular postion array we have to find the index of the postion which is postion - 1 coz indexing is always starts from 0; ex- pos =5 then 5th postion's index will be 4   
        for(int i = size-1 ; i>=index ; i--){
            /* run the for loop from the last element to the index at which element has to be added
             * last element's index will be size - 1
             * start from last element which is going to be 4 and its index will be 3
             * condtion ->while 4>=index in this case 3 4>=3 , decrement i--
             * push the elements further , arr[4] 's value will be shifted to arr[5]
             * then i becomes 3 and condition is not satisfied loop will end
             */
            arr[i+1]= arr[i];

        }
        arr[index]=element;// after shifting adding the disred element at index
        return 1; 
    }

    
}
        