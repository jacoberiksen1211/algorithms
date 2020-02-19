public class Main {

    public static void main(String[] args) {
	    Lecture1 one = new Lecture1();
        int[] A = {1,2,3,4,5};
        int n = 5;
        int out = one.f(A, n);
        System.out.println(out);
        out = one.f2(A, n);
        System.out.println(out);
    }
}
