public class mandatory1 {
    public static void main(String[] args) {
        int[] A = {3, 2, 2, 2, 4, 5, 5, 3, 4, 4, 4, 4, 4, 4, 6, 2, 1};
        int n = 8;
        int chainLength = 1;
        int max = 1;
        int chainStart = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[chainStart] == A[i]) {
                chainLength++;
            } else {
                chainStart = i;
                chainLength = 1;
            }
            if (chainLength > max) {
                max = chainLength;
            }
        }
        System.out.println(max);
    }
}
