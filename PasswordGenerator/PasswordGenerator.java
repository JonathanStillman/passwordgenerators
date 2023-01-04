import java.util.Random;

public class PasswordGenerator {

    // Fields
    private String password; // The generated password itself
    private int passwordLength; // The length of the password
    private Random rng; // RNG = random number generator

    public PasswordGenerator(int passwordLength) {
        this.passwordLength = passwordLength;
        this.rng = new Random();
        
    }

    public void generate() {
        String possibleChars = "abcdefghijklmnopqrstuvwxyz";
        int randomBound = possibleChars.length();

        // Algorithm: Loop until the disired length of the password
        // Each iteration, append the chosen character in the string of possible characters.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.passwordLength; i++) {
            sb.append(possibleChars.charAt(this.rng.nextInt(randomBound)));
        }

        // Set the password field to the built password.
        this.password = sb.toString();
    }
    
    public String getPassword() {
        return this.password;
    }

    // Getter for passwordLength
    public int getPasswordLength() {
        return this.passwordLength;
    }

    public Random getRng() {
        return this.rng;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}