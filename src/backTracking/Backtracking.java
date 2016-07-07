package backTracking;
public class Backtracking {
	private static int A[];

	static void Binary(int n) {
		if (n < 1) {
			System.out.println(A);
		} else {
			A[n - 1] = 0;
			Binary(n - 1);
			A[n - 1] = 1;
			Binary(n - 1);
		}
	}

	public static void main(String[] args) {
		A = new int[4];
		Binary(4);
	}
}
