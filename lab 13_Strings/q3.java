//Decomposition of the given string


public class q3 {
    public static void main(String[] args) {
        String s1 = "KIIT University";
        
        // Split the string into an array of words
        String[] words = s1.split(" ");
        
        // Print the words in the array
        for (String word : words) {
            System.out.println(word);
        }
    }
}
