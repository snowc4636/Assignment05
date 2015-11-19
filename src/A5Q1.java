
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author snowc4636
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word");
        String definition = input.nextLine();



        String Englisch = definition;
//If is starts with a vowel replace the first vowel with an i

        if (Englisch.startsWith("a")
                || Englisch.startsWith("o")
                || Englisch.startsWith("e")
                || Englisch.startsWith("u")) {
            String number1 = Englisch.substring(0, 1);
            Englisch = Englisch.replaceFirst(number1, "i");
//If englisch ends with a vowel add "hee" to the end
                        if (Englisch.endsWith("a")
                                || Englisch.endsWith("i")
                                || Englisch.endsWith("e")
                                || Englisch.endsWith("o")
                                || Englisch.endsWith("u")) {
                            System.out.println(" In Englisch: " + Englisch + "hee");
//add "ee" top the end                          
                        }else{
                             System.out.println(" In Englisch: " + Englisch + "ee");
                          
                        }
        } else {

            while (!definition.startsWith("a")
                    || !definition.startsWith("e")
                    || !definition.startsWith("i")
                    || !definition.startsWith("o")
                    || !definition.startsWith("u")) {

                if (definition.equals("Done")) {
                    System.out.println("Nothing found ");
                    break;
                }
//This will happen if the word starts with a vowel
                if (!Englisch.startsWith("e")
                        && !Englisch.startsWith("o")
                        && !Englisch.startsWith("u")
                        && !Englisch.startsWith("i")
                        && !Englisch.startsWith("y")
                        && !Englisch.startsWith("a")) {
                    String one = Englisch.substring(0, 1);
                    String second = Englisch.substring(1);
                    Englisch = second + one;
                    String number1 = Englisch.substring(0, 1);
                    Englisch = Englisch.replaceFirst(number1, "i");
                    System.out.println(" In Englisch: " + Englisch + "ee");
            
                }
                
                
            }
        }
    }
}
