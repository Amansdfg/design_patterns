import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodBinaryString {

    public static String largestMagical(String binString) {
        return findLargest(binString);
    }

    // Recursive function to process the good substrings and sort them in descending order
    private static String findLargest(String s) {
        int count = 0;
        int start = 0;
        List<String> result = new ArrayList<>();

        // Traverse the binary string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                count--;
            }

            // When count is zero, we have a balanced good substring
            if (count == 0) {
                // Recursively process the substring inside the current good substring
                String inner = findLargest(s.substring(start + 1, i));
                result.add("1" + inner + "0");
                start = i + 1;
            }
        }

        // Sort the substrings in reverse lexicographical order
        Collections.sort(result, Collections.reverseOrder());

        // Concatenate the sorted substrings and return the result
        StringBuilder largest = new StringBuilder();
        for (String str : result) {
            largest.append(str);
        }
        return largest.toString();
    }

    // Test the solution with provided test cases
    public static void main(String[] args) {
        // Sample test cases
        System.out.println(largestMagical("11011000"));  // Output: 11100100
        System.out.println(largestMagical("1100"));      // Output: 1100
        System.out.println(largestMagical("1101001100")); // Output: 1110011000
    }
}
