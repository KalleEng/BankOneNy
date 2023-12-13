import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Functions functions;

    public UserInterface(Scanner scanner, Functions functions) {
        this.scanner = scanner;
        this.functions = functions;
    }

    public void showMenu() {
        System.out.println("1. Insättning\n2. Uttag\n3. Se saldo\n4. Kontakta oss\n5. Logga ut");
    }

    public boolean userChoice() {
        while (true) {
            showMenu();
            int userChoice = getUserChoice();

            switch (userChoice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    functions.showBalance();
                    break;
                case 4:
                    contactUs();
                    break;
                case 5:
                    return logOut();
            }
        }
    }

    private int getUserChoice() {
        try {
            System.out.print("Välj en handling: ");
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ogiltig inmatning. Vänligen ange ett heltal.");
            scanner.nextLine();
            return -1;
        }
    }

    private void deposit() {
        functions.showBalance();
        System.out.print("Sätt in belopp att sätta in: ");
        double depositAmount = scanner.nextDouble();

        if (depositAmount >= 0) {
            functions.deposit(depositAmount);
        } else {
            System.out.println("Ogiltigt belopp. Sätt in ett positivt belopp");
        }
    }

    private void withdraw() {
        functions.showBalance();
        System.out.print("Skriv in belopp att ta ut: ");
        double withdrawAmount = scanner.nextDouble();
        functions.withdraw(withdrawAmount);
    }

    private void contactUs() {

    }

    private boolean logOut() {
        System.out.println("Du är utloggad");
        System.out.println("Välkommen åter");
        return true;
    }
}
