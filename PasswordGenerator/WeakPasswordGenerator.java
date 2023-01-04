public class WeakPasswordGenerator extends PasswordGenerator {
    
    public WeakPasswordGenerator(int passwordLength) {
        super(passwordLength);
    }

    @Override
    public void generate() {

        // Creating an array of common passwords
        String[] possiblePasswords = new String[] {"password", "letmein", "123456", "qwerty"
                                , "asdf", "mypassword", "pass", "something", "march202022", "123"
                                , "helloworld", "march20", "february142000", "april12011", "randompass"
                                , "nothing", "qwertyuiop", "byebye", "username"};

        int randIndex = super.getRng().nextInt(possiblePasswords.length);
        super.setPassword(possiblePasswords[randIndex]);
    }
}
