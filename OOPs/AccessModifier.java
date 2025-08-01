public class AccessModifier {
    public static void main(String[] args) {
        Bankaccount b1 = new Bankaccount();
        b1.username = "Ayushi";
        // b1.passwd = "Ayushi@098";   this will show error bcoz a private 
                                    // variable can't be accessed outiose the class.
        System.out.println(b1.username);
        b1.setpswd("Ayushi@098");
        // System.out.println(b1.passwd);  we can only set the password , it cannot be print .

        b1.Bankpin = 134;   // protected var can be accessed within package. 
        System.out.println(b1.Bankpin); // it can be accessed in other java file of this OOPS package.
    }
}

class Bankaccount{
    public String username;
    private String passwd;
    protected int Bankpin;

    void setpswd(String pswd){
        passwd = pswd;
    }
}
