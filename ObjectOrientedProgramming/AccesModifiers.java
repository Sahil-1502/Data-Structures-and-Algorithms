package ObjectOrientedProgramming;

public class AccesModifiers {

    public static void main(String args[]){
        BankAccount A1 = new BankAccount();
        A1.username = "sahil";
        // A1.password = "12345678";
        //the above statement shows error

        A1.setPassword("12345678");

    }
    
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String newPassword){
        password = newPassword;
    }

} 
