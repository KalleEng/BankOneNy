import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface extends ContactsFromFile {
    private Scanner scanner;
    private Functions functions;

    public UserInterface(Scanner scanner, Functions functions) {
        this.scanner = scanner;
        this.functions = functions;
    }

    public void showMenu() {
        System.out.println("1. Insättning\n2. Uttag\n3. Se saldo\n4. Hantera lån\n5. Kontakta oss\n6. Logga ut");
    }

    public boolean userChoice() throws InterruptedException {
        while (true) {
            showMenu();
            int userChoice = getUserChoice();

            switch (userChoice) {
                case 1 -> deposit();
                case 2 -> withdraw();
                case 3 -> functions.showBalance();
                case 4 -> handleLoan();
                case 5 -> contactUs();
                case 6 -> {
                    return logOut();
                }
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
        System.out.print("Skriv belopp att sätta in: ");
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
        getContacts();
    }

    private boolean logOut() throws InterruptedException {
        System.out.println("Du är utloggad");
        Thread.sleep(1000);
        System.out.println("Välkommen åter");
        return true;
    }
    private void handleLoan() throws InterruptedException {
        System.out.println("Välj typ av lån\n" +
                "1. Bolån\n" +
                "2. privatlån");
        scanner.nextLine();
        String typeOfLoan = scanner.nextLine();
        if(typeOfLoan.equals("1")){
            System.out.println("Hur mycket vill du låna för bolån");
            double loanAmount = scanner.nextDouble();
            functions.loan(loanAmount);
            Thread.sleep(1500);
        }else if (typeOfLoan.equals("2")){
            System.out.println("Hur mycket vill du låna för privatlån");
            double loanAmount = scanner.nextDouble();
            functions.loan(loanAmount);
            Thread.sleep(1500);
        }
    }
}
