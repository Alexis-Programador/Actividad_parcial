public class HardcodedPasswordExample {

    public static void main(String[] args) {

        String username = "admin";
        String password = "123456";

        if(username.equals("admin") && password.equals("123456")){
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

    }
}