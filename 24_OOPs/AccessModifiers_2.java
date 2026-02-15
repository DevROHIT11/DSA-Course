
public class AccessModifiers_2 {

    public static void main(String[] args) {
        BankAccount u1 = new BankAccount();
        u1.Username = "Rohit";
        // u1.password = "jhbhyedfdg" ; throws error can't access
        // System.out.println(u1.password); this will also throw error

        System.out.println(u1.Username);

        u1.setPassword("nbhjfffs34");
        System.out.println(u1.getPassword());

    }

}

class BankAccount {

    String Username;
    private String password;

    // can acces the private var within the class
    // SETTER
    void setPassword(String p) {
        // this points to current password attribute and store p value in that
        this.password = p;
    }

    // GETTER
    String getPassword() {
        // this returns the current password

        return this.password;
    }
}
