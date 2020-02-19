import java.util.ArrayList;
import java.util.Scanner;

public class ComboBreaker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int counter = 0;
       // int counter2 = 3;
        int ccount = 0;
        int lcount = 0;
        int rcount = 0;
        int scount = 0;
        input.nextLine();
        String[] list = input.nextLine().split(" ");

        String out = "";

        // ENEMY: C, L, R, S
        // return: M, E, C, S
        while((counter + 3) < list.length){ //while combo possible (block of 4 available)
            for(int i = 0; i < 4; i++) {
            //checking block for combo
                if (list[counter + i].equals("C")){
                    ccount++;
                }
                else if (list[counter + i].equals("L")){
                    lcount++;
                }
                else if(list[counter + i].equals("R")){
                    rcount++;
                }
                else if(list[counter + i].equals("S")){
                    scount++;
                }
            }

            if(ccount == 1 && lcount == 1 && rcount == 1 && scount == 1){
                //COMBOBREAKER
                out += "F ";
                counter += 4;

            }
            else{//not combo breaker
                if (list[counter].equals("C")){
                    out += "M ";}
                else if (list[counter].equals("L")){
                    out += "E ";}
                else if (list[counter].equals("R")){
                    out += "C ";}
                else if (list[counter].equals("S")){
                    out += "S ";}

                counter++;

            }
            //resetting for next block
            ccount = 0;
            lcount = 0;
            rcount = 0;
            scount = 0;
        }

        // sidste bogstaver, som ikke kan være i combo:
        while(counter < list.length){
            if (list[counter].equals("C")){
                out += "M ";}
            else if (list[counter].equals("L")){
                out += "E ";}
            else if (list[counter].equals("R")){
                out += "C ";}
            else if (list[counter].equals("S")){
                out += "S ";}

            counter++;
        }


        if(out.length() != 0) {
            out = out.substring(0, out.length() - 1);//fjerner sidste mellemrum
        }
        System.out.println(out);
    }
}
