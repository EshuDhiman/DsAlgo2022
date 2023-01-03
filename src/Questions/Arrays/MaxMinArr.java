package Questions.Arrays;

public class MaxMinArr {
  
        public static void _minmaxarr() {
    
            int arr[] = { 3, 5, 4, -1, 9 };
            int max = arr[0];
            int min = arr[0];
            for (int index = 1; index < arr.length; index++) {
                if (max <= arr[index]) {
                    max = arr[index];
    
                }
    
            }
            for (int index = 1; index < arr.length; index++) {
                if (min >= arr[index]) {
                    min = arr[index];
    
                }
    
            }
    
            System.out.println(max);
            System.out.println(min);
        }
        public static void main(String[] args) {
            _minmaxarr();
        }
    
    }
    
    
    