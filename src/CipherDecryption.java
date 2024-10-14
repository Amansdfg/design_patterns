import java.io.*;
import java.util.regex.Pattern;

public class CipherDecryption {

    // Define a pattern for valid decrypted messages (adjust as needed)
    private static final Pattern validPattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z0-9]+$");

    // Caesar Cipher decryption method
    public static String caesarDecrypt(String ciphertext, int shift) {
        StringBuilder decrypted = new StringBuilder();
        for (char ch : ciphertext.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                decrypted.append((char) ((ch - base - shift + 26) % 26 + base));
            } else {
                decrypted.append(ch); // Leave non-letter characters unchanged
            }
        }
        return decrypted.toString();
    }

    // Vigenère Cipher decryption method
    public static String vigenereDecrypt(String ciphertext, String key) {
        StringBuilder decrypted = new StringBuilder();
        int keyLength = key.length();

        for (int i = 0; i < ciphertext.length(); i++) {
            char ch = ciphertext.charAt(i);
            char keyCh = key.charAt(i % keyLength); // Repeated key
            int shift = keyCh - 'a'; // Shift value

            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                decrypted.append((char) ((ch - base - shift + 26) % 26 + base));
            } else {
                decrypted.append(ch); // Leave non-letter characters unchanged
            }
        }
        return decrypted.toString();
    }

    // Method to check if a string contains both letters and numbers
    private static boolean isValidMessage(String message) {
        return validPattern.matcher(message).matches();
    }

    // Method to find the correct key by iterating over the key file
    public static void findCorrectKey(String ciphertext, String keyFilePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(keyFilePath))) {
            String key;

            // Test Caesar cipher with all possible shifts
            for (int shift = 0; shift < 26; shift++) {
                String decryptedMessage = caesarDecrypt(ciphertext, shift);
                if (isValidMessage(decryptedMessage)) {
                    System.out.println("Possible Caesar Shift: " + shift + ", Decrypted Message: " + decryptedMessage);
                    return; // Stop after finding a valid message
                }
            }

            // Test Vigenère Cipher with keys
            while ((key = br.readLine()) != null) {
                key = key.trim(); // Remove any leading/trailing spaces
                String decryptedMessage = vigenereDecrypt(ciphertext, key);
                if (isValidMessage(decryptedMessage)) {
                    System.out.println("Possible Vigenère Key: " + key + ", Decrypted Message: " + decryptedMessage);
                    return; // Stop after finding a valid message
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Ciphertext you want to decrypt
        String ciphertext = "yrgzxeyiskmkxer";

        // Path to the file with 10 million keys
        String keyFilePath = "possible_keys.txt"; // Replace with your key file path

        // Run the decryption process
        findCorrectKey(ciphertext, keyFilePath);
    }
}