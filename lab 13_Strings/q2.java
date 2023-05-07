//Sorting string array
import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        String[] strings = { "banana", "apple", "date", "cherry", "elderberry" };

        // Sort the array of strings
        Arrays.sort(strings);

        // Print the sorted array
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
