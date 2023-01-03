package Questions.Arrays;

public class PildromArray {
	public static void main(String[] args) {
		int[] a = { 111, 222, 333, 444 };
		int n = 4;
		if (PalinArray(a, n) == 1) {
			System.out.println("1");

		} else {
			System.out.println("0");
		}

	}

	public static int PalinArray(int[] a, int n) {
		int count = 0;

		for(int i = 0; i < a.length; i++) {
			int rev = 0;
			int indexArr = a[i];

			while(indexArr != 0) {
				rev = ((rev * 10) + (indexArr % 10));
				indexArr = indexArr / 10;

			}
			if(rev == a[i]) {
				count += 1;
			} else {
				return 0;
			}

		}
		if(count == n) {
			return 1;

		} else {
			return 0;
		}

	}

}
