import java.util.Scanner;

/* 
*           Simple Java Program to Decode Morse Code
*           ----------------------------------------
*           Author : Noman Prodhan
*           Leader of Knight Squad Community
*           www.nomantheking.com www.nomanprodhan.com
*           www.knightsquad.org www.nstechvalley.com
*           www.hack.knightsquad.org www.kshackzone.com
*/

public class MorseDecoder {
    public static void main(String[] args) {
        String[] morseCodes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "--..--",
                "..--..", "---...", "-....-", ".-..-.", "-.--.", "-...-", ".-.-.-", "-.-.-.", "-..-.", ".----.",
                "..--.-", "-.--.-", ".-.-.", ".--.-.", "-.-.--", "-.-.--", ".....", ".-..." };
        String[] plainChars = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", "?",
                ":", "-", "\"", "(", "=", ".", ";", "/", "'", "_", ")", "+", "@", "!", "#", "$", "&" };
        String morseInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Morse Code : ");
        morseInput = sc.nextLine();
        String[] morseSlice_1 = morseInput.split("/");
        String finalOutput = "";
        for (int n = 0; n < morseSlice_1.length; n++) {
            String[] morseTmpSlice = morseSlice_1[n].split(" ");
            for (int s = 0; s < morseTmpSlice.length; s++) {
                for (int i = 0; i < morseCodes.length; i++) {
                    if (morseTmpSlice[s].equals(morseCodes[i])) {
                        finalOutput += plainChars[i];
                    }
                }
            }
            finalOutput += " ";
        }
        System.out.println("\nPlain Text [Lowercase] : \n " + finalOutput);
        System.out.println("Plain Text [Uppercase] : \n " + finalOutput.toUpperCase());
    }
}
