package UniqueMorseCodeWords804;

import java.util.HashSet;

/**
 * International Morse Code defines a standard encoding where each letter is
 * mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b"
 * maps to "-...", "c" maps to "-.-.", and so on.
 *
 * For convenience, the full table for the 26 letters of the English alphabet
 * is given below:
 *
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
 * "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
 * "-.--","--.."]
 *
 * Now, given a list of words, each word can be written as a concatenation of
 * the Morse code of each letter. For example, "cab" can be written as
 * "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll
 * call such a concatenation, the transformation of a word.
 *
 * Return the number of different transformations among all words we have.
 *
 * Example:
 * Input: words = ["gin", "zen", "gig", "msg"]
 * Output: 2
 * Explanation:
 * The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 *
 * There are 2 different transformations, "--...-." and "--...--.".
 *
 *
 * Note:
 *
 * The length of words will be at most 100.
 * Each words[i] will have length in range [1, 12].
 * words[i] will only consist of lowercase letters.
 *
 * Created by Andrew on 6/4/2018.
 */
public class UniqueMorseCodeWords {
    public static int uniqueMorseCodeWords(String[] words){
        HashSet<String> morseWords = new HashSet<>();
        String[] morseDict = new String[]{".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
                "--.-",".-.","...","-","..-","...-",".--","-..-","-.--",
                "--.."};
        String newMorseWord;

        for(String word : words){
            newMorseWord = new String();
            for(char letter : word.toCharArray()){
                newMorseWord += morseDict[letter - 97];
            }

            morseWords.add(newMorseWord);
        }

        return morseWords.size();
    }
}
/**
 * When I wrote this code, I was aware that StringBuilders take a little less
 * time than operating with Strings, however, I decided to use strings because
 * it fits in better with functional programming. This kind of isn't consistent
 * with the for loops in my code however... But right now I want to focus on
 * recognizing which algorithms to use when until it becomes second nature.
 * Perhaps I'll come back to it later to remove the for each loops for streams?
 * I don't know...
 */