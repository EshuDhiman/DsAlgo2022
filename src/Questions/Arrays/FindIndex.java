package Questions.Arrays;

import java.util.Arrays;

public class FindIndex {
    static int[] findIndex(int a[], int N, int key) {
        int arr[] = { -1, -1 };
        int temp;
        for (int i = 0; i < N; i++) {
            if (a[i] == key) {
                arr[0] = i;
                for (int j = i + 1; j < N; j++) {
                    if (a[j] == key) {
                        arr[1] = j;

                    }

                }
                if (arr[1] == -1) {
                    arr[1] = arr[0];

                    return arr;
                }
                else{
                    return arr;
                }
            }
        }
        // System.out.println(Arrays.toString(arr));
        return arr;

    }

    public static void main(String[] args) {
        int N = 26;
        int arr[] = { 23, 29, 30, 21, 16, 10, 29, 27, 19, 12, 30, 20, 10, 27, 30, 24, 20, 27, 22, 16, 27, 24, 24, 11,
                12, 29 };
        int Key = 29;
        findIndex(arr, N, Key);

    }

}
