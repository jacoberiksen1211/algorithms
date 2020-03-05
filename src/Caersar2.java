import java.util.ArrayList;
import java.util.Scanner;

public class Caersar2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] alfabet = new String[26];
        String[] input = scanner.nextLine().split(" ");
        ArrayList<Character> out = new ArrayList<>();
        int push;

        //sætter alfabetet ind i array
        for(int i = 0; i < 26; i++){
            alfabet[i] = String.valueOf((char) (i + 65));
        }

        for(int i = 0; i < input.length; i++){
            if(input[i].charAt(0) >= 'A' && input[i].charAt(0) <= 'Z'){
                out.add(input[i].charAt(0));
            }
            if (input[i].charAt(0) >= '0' && input[i].charAt(0) <= '9'){
                //nothing - ignoring numbers
            }
            else if(input[i].equals("^")) {
                i--; //går til tegnet før ^
                if (input[i].charAt(0) >= '0' && input[i].charAt(0) <= '9') { //if number
                    push = Integer.parseInt(input[i]);
                }
                out.remove(i); //sletter
                i--; //arrayliste rykker mod venstre ved remove...
            }
            else{
             //   if (push != 0){
                    //caster char som int for at få ascii værdi og lægger "push" til
                   // int ascii = ((input.(i).charAt(0) - 65 + push) % 25) + 65;

              //      char result = (char) ascii;
                 //   input.set(i, String.valueOf(result));
                }
                // ingen ændringer foretages hvis push er 0 og det er bogstav

        }


        for (Character x :
                out) {
            System.out.println(x);
        }
    }
}
