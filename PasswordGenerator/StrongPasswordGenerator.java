public class StrongPasswordGenerator extends PasswordGenerator {
    
    public StrongPasswordGenerator(int passwordLength) {
        super(passwordLength);
        // Throw exception if the password length is too short or too long
        if (passwordLength < 8 || passwordLength > 20) {
            throw new IllegalArgumentException("password length must be between 8 and 20");
        }

    }

    @Override
    public void generate() {
        String possibleChars = "abcdefghijklmnopqrstuvwxyz1234567890";
        int randomBound = possibleChars.length();

        // Algorithm: Loop until the disired length of the password
        // Each iteration, append the chosen character in the string of possible characters.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < super.getPasswordLength(); i++) {
            // Maybe generate upper and lower case characters
            int randNumber = super.getRng().nextInt(2);
            char pickedChar = possibleChars.charAt(super.getRng().nextInt(randomBound));
            String appended = "" + pickedChar;
            appended = randNumber == 0 ? appended.toUpperCase() : appended;
            sb.append(appended);
        }

        // Set the password field to the built password.
        super.setPassword(sb.toString());
    }
}
