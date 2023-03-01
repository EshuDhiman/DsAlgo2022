package Questions.Arrays;

public class FirstElementToOccurKTimens {
    public static void main(String[] args) {
        int N = 10;
        int K = 3;
        int A[] = { 4, 2, 2, 2, 3, 4, 4, 4, 3, 2 };
        // int A[] = { 1, 7, 4, 3, 4, 8, 7 };
        // int A[] = { 3, 4, 1, 3, 4, 4 };
        firstElementKTime(A, N, K);
    }

    public static int firstElementKTime(int[] a, int n, int k) {
        // int count = 0;
        int p = 0;
        int temp = 0;
        int index = 0;
        int prevIndex = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            p = p + 1;

            {
                for (int j = p; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        // prevIndex = index;
                        // index = j;
                        index = prevIndex;
                        prevIndex = j;
                        if (index >= prevIndex) {
                            temp = a[j];
                            count++;

                        }

                    }
                }
            }

        }
        if (temp != 0) {
            System.out.println(temp);
            return temp;
        }
        // System.out.println("-1");
        return -1;
    }
}
