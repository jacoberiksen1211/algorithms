import java.util.Scanner;

public class PeakAlg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] A = new int[n];

        for(int i=0; i < A.length; i++){
            A[i] = scanner.nextInt();
        }

        System.out.println(peak2(A,n));
    }

    public static int peak1(int[]A, int n) {
        if (A[0] >= A[1]) {
            return 0;
        }
        for (int i = 1; i < n -2; i++) {
            if (A[i - 1] <= A[i] && A[i] >= A[i + 1])
                return i;
        }
        if (A[n - 2] <= A[n - 1]) {
            return n - 1;
        }
        return 0;
    }

    public static int peak2(int[]A, int n) {

        int max = 0;
        for (int i = 0; i < n; i++){
            if (A[i] > A[max]) max = i;
        }
        
        return max;
    }

    public static int peak3(int[]A, int i, int j) {

        int m = (i+j)/2;
        if (m == i && A[m] >= A[m+1]){
            return m;
        }
        else if (m == j && A[m] >= A[m-1]){
            return m;
        }
        else if (A[m] >= A[m-1] && A[m] >= A[m+1])  return m;
        else if (A[m-1] > A[m]) {
            return peak3(A, i, m - 1);
        }
        else if (A[m] < A[m+1]) {
            return peak3(A, m + 1, j);
        }
        return 0;
    }
}
