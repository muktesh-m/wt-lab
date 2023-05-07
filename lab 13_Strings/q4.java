//Check for palindrome string


public class q4{
    public static void main(String[] args) {
        String s = "racecar";
        
        // Reverse the string
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        
        // Compare the original and reversed strings
        if (s.equals(reversed)) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }
}
