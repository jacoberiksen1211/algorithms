import java.util.Scanner;

public class Ring_of_fire {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 11;//input.nextInt(); //number of students
        int c = 2;//input.nextInt(); //counter threshhold
        int k = 3;//input.nextInt(); //number of friends in class or pieces of cake
        input.close();

        int loseCount = 0;
        int counter = 0;
        boolean[] list = new boolean[n];
        while (loseCount < n-k) {
            if(counter >= n){
                counter -= n;
            }
            if(!list[counter] && (counter % c) == 0){
                list[counter] = true;
                loseCount++;
            }
            counter++;
        }
        String out = "";
        for(int i = 0; i < n; i++){
            if(!list[i]){
                out += (i+1) + " ";
            }
        }
        System.out.println(out);

    }
}
