import java.util.Scanner;

public class Ring_of_fire {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //number of students
        int c = input.nextInt(); //counter threshhold
        int k = input.nextInt(); //number of friends in class or pieces of cake
        input.close();

        int loseCount = 0;
        int counter = 0;
        int current = 0;
        boolean[] deadList = new boolean[n];
        while (loseCount < (n-k)) {
            if(current == n){
                current = 0;
            }
            if(!deadList[current]){
               if(counter == c-1){
                   deadList[current] = true;
                   loseCount++;
                   counter = 0;
               }
               else {
                   counter++;
               }
            }
            current++;
        }
        String out = "";
        for(int i = 0; i < n; i++){
            if(!deadList[i]){
                out += (i+1) + " ";
            }
        }
        out = out.substring(0, out.length()-1);
        System.out.println(out);

    }
}
