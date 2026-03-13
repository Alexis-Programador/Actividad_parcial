import java.util.Scanner;

public class CommandInjectionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter IP address to ping:");
        String ip = scanner.nextLine();

        try {
            // Vulnerable command execution
            Runtime.getRuntime().exec("ping " + ip);

            System.out.println("Command executed");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}