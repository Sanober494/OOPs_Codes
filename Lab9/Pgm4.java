/*An anagram is a word or a phrase made by transposing the letters of another word or
phrase; for example, "parliament" is an anagram of "partial men," and "software" is an anagram
of "swear oft." Write a program that figures out whether one string is an anagram of another
string. The program should ignore white space and punctuation.*/
import java.util.Arrays;

public class Pgm4 {
    public static void main(String[] args) {
        String string1 = "parliament";
        String string2 = "partial men";

        if (isAnagram(string1, string2)) {
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are not anagrams.");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        
        str1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();      
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
