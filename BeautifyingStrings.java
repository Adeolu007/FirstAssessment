package FirstAssessment;

import java.util.Scanner;

//(Beautifying Strings) Write methods that accomplish each of the following tasks:
//        a) Check whether the string is terminated by a full stop, and if not, add a full stop.
//        b) Check whether the string starts with a capital letter, and if not, capitalize the first letter.
//        c) Use the methods developed in parts (a) and (b) and to write a method beautifyString
//        that receives a string from the user, and then calls the methods in (a) and (b) to make
//        sure that the string is properly formatted, in other words, the string has a full stop at
//        the end, and a cap
public class BeautifyingStrings {

    public static String checkFullStop(String words){
        if (words.charAt(words.length()-1) != '.'){
            words += ".";
        }

        return words;
    }

    public static String capitalLetter(String words){
        String first = String.valueOf(words.charAt(0)).toUpperCase();
        String refinedWord = words;

        if (!String.valueOf(words.charAt(0)).equals(first)){
            refinedWord = words.replace(String.valueOf(words.charAt(0)),first);
        }

        return refinedWord;
    }

    public static String beautifyString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter your words");
        String  words = scanner.nextLine();
        String modified =  capitalLetter(words);

      return checkFullStop(modified);

    }




    public static void main(String[] args) {
//        System.out.println(checkFullStop("Adeiippp."));
//        System.out.println(checkFullStop("Adeiippp"));
//        System.out.println( capitalLetter("Adeolu"));
//        System.out.println(capitalLetter("adeolu"));
        System.out.println(  beautifyString());


    }
}
