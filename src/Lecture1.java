public class Lecture1 {
    public Lecture1(){}
    public int loop1(int n) {
        int x = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) x++;
        }
        return x;
    }
    public int loop2(int n) {
        int x = 0;
        for(int i = 0; i < n; i++) x++;
        for(int j = 0; j < n; j++) x++;
        return x;
    }
    public int loop3(int n) {
        int x = 0;
        for(int i = 0; i < n; i++) {
            if (i == n-1) for(int j = 0; j < n; j++) x++;
        }
        return x;
    }
    public int loop4(int n) {
        int x = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) x++;
        }
        return x;
    }
    public int f(int[] A, int n) {
        if(n == 0) return 0;
        else return f(A, n - 1) + A[n-1];
    }

    public int f2(int[] A, int n){
        int sum = 0;
        for (int a : A){
            sum+=a;
        }
        return sum;
    }

}


