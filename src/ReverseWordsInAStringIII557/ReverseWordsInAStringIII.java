package ReverseWordsInAStringIII557;

public class ReverseWordsInAStringIII {
    public static String reverseWords(String s){
        StringBuilder builder = new StringBuilder();

        for(String word : s.split(" ")){
            for(int i = word.length() - 1; i >= 0; i--){
                builder.append(word.charAt(i));
            }

            builder.append(" ");
        }

        return builder.toString().trim();
    }
}
