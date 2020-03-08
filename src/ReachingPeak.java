import java.util.Scanner;

public class ReachingPeak {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int index ;
        int[] list = new int[n];

        if(n==1){
            System.out.println(0);
        }
        else if(n==2){
            System.out.println(1);
        }
        else {
            for (int i = 0; i < n; i++) {
                list[i] = i;
            }
            int left = n;
            int rounds = (int) Math.ceil(Math.log(n) / Math.log(2));

            //System.out.println(rounds); //maksimum gange man kan halvere... når man når hertil har man fundet et sted der skal outputtes
            peak3(list, 0, n - 1, 0, rounds);
        }

    }
    public static void peak3(int[]A, int i, int j, int roundcount, int rounds) {

        int m = (i + j) / 2;
        roundcount++;
        if (roundcount == rounds) {
            System.out.println(A[m]);
        }

        if (i != j) {
            if(m>i) {
                peak3(A, i, m - 1, roundcount, rounds);//gå til venstre
            }
            if(m<j) {
                peak3(A, m + 1, j, roundcount, rounds);//gå til højre
            }
        }
    }

}

