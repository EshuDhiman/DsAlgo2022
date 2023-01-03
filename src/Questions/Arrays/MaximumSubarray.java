package Questions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 5, -7, 2, 3 };

        int n = 6;
        findSubarray(a, n);

    }

    public static ArrayList<Integer> findSubarray(int a[], int n) {
        ArrayList<Integer> subArrayList = new ArrayList<Integer>();
        Integer sum =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                subArrayList.add(a[i]);
            }
        }
        int size =subArrayList.size();
        for (int i = 0; i < size; i++) {
            sum=subArrayList.get(i)+sum;
        }
       
        // System.out.println(subArrayList);
        // System.out.println(sum);
        return subArrayList;

    }

}
