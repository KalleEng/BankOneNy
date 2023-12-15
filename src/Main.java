import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        BankFacade bf = new BankFacade();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("1. Logga in\n2. Registrera nytt konto\n3. Exit\n");
            String choice = scanner.next();

            if (choice.equals("1")) {

                if (bf.Login()) {
                    bf.userChoice();
                }
            } else if (choice.equals("2")) {
                bf.Register();
                bf.userChoice();
            } else if (choice.equals("3")) {
                System.exit(0);
            } else {
                System.out.println("Ogiltig inmatning. Försök igen");
            }
        }
    }
}