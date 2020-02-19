import java.util.ArrayList;
import java.util.Scanner;

public class Ring_of_fire1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //number of students
        int c = input.nextInt(); //counter threshhold
        int k = input.nextInt(); //number of friends in class or pieces of cake
        input.close();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        int current = 0;

        //loop
        while (list.size() > k) {
            current = (current+c-1) % list.size();
            list.remove(current);
        }

        //creating output
        String out = "";
        for(int i = 0; i < list.size(); i++){
            out += list.get(i)+1 + " ";
        }
        out = out.substring(0, out.length()-1);
        System.out.println(out);

    }

}
