public class Main {
    
    public static void main(String[] args) {

        // Make similar versions: One that generates strong passwords,
        // One that generate mega strong passwords
        // And one that generates weak passwords

        // Testing password (Version 1.0)
        PasswordGenerator myPass = new PasswordGenerator(10);
        myPass.generate();
        System.out.println(myPass.getPassword());

        // Testing strong password generator (Version 2.0)
        PasswordGenerator myStrongPass = new StrongPasswordGenerator(10);
        myStrongPass.generate();
        System.out.println(myStrongPass.getPassword());

        // Testing weak password generator (Version 3.0)
        PasswordGenerator myWeakPass = new WeakPasswordGenerator(3);
        myWeakPass.generate();
        System.out.println(myWeakPass.getPassword());
    }
}