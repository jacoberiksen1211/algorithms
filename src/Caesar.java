import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Caesar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //String[] list = scanner.nextLine().split(" ");
        int push = 0;
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(scanner.nextLine().split(" ")));

        for(int i = 0; i < list.size(); i++){
            if (list.get(i).charAt(0) >= '0' && list.get(i).charAt(0) <= '9'){
                //nothing - ignoring numbers
            }
            else if(list.get(i).equals("^")) {
                list.remove(i); //fjerner "^"
                i--; //går til tegnet før "^"
                if (list.get(i).charAt(0) >= '0' && list.get(i).charAt(0) <= '9') { //if number
                    push = Integer.parseInt(list.get(i)); //set push to number that will be deleted
                }
                list.remove(i); //sletter
                i--; //arrayliste rykker mod venstre ved remove...
            }
            else{
                if (push != 0){
                    //caster char som int for at få ascii værdi og lægger "push" til
                    int ascii = ((list.get(i).charAt(0) - 65 + push) % 26) + 65;

                    char result = (char) ascii;
                    list.set(i, String.valueOf(result));
                }
                // ingen ændringer foretages hvis push er 0 og det er bogstav
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.println((int)list.get(i).charAt(0) - 65);;
        }


    }
}
