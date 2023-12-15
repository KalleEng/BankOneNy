import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface extends ContactsFromFile {
    private Scanner scanner;
    private Functions functions;
    private BankFacade bf;

    public UserInterface(Scanner scanner, Functions functions, BankFacade bf) {
        this.scanner = scanner;
        this.functions = functions;
        this.bf = bf;
    }

    public void showMenu() {
        System.out.println("1. Insättning\n2. Uttag\n3. Se saldo\n4. Hantera lån\n5. Spärra kort\n6. Aktivera online-köp\n7. Kontakta oss\n8. Logga ut");
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
                case 5 -> suspendCard();
                case 6 -> activateOnlinePurchases();
                case 7 -> contactUs();
                case 8 -> {
                    return logOut();
                    //Insättning, betalning, visa saldo, kontakta, ta lån, spärra konto, aktivera online köp, logout
                }
            }
        }
    }

    public int getUserChoice() {
        try {
            System.out.print("Välj en handling: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
        } catch (InputMismatchException e) {
            System.out.println("Ogiltig inmatning. Vänligen ange ett heltal.");
            scanner.nextLine();
            return -1;
        }
    }

    public void deposit() {
        functions.showBalance();
        System.out.print("Skriv belopp att sätta in: ");
        double depositAmount = scanner.nextDouble();
        scanner.nextLine();
        if (depositAmount >= 0) {
            functions.deposit(depositAmount);
        } else {
            System.out.println("Ogiltigt belopp. Sätt in ett positivt belopp");
        }
    }

    public void withdraw() {
        functions.showBalance();
        System.out.print("Skriv in belopp att ta ut: ");
        double withdrawAmount = scanner.nextDouble();
        scanner.nextLine();
        functions.withdraw(withdrawAmount);
    }

    public void contactUs() {
        getContacts();
    }

    public boolean logOut() throws InterruptedException {
        System.out.println("Du är utloggad");
        Thread.sleep(1000);
        System.out.println("Välkommen åter");
        return true;
    }

    public void handleLoan() throws InterruptedException {
        System.out.println("Välj typ av lån\n" +
                "1. Bolån\n" +
                "2. privatlån");
        scanner.nextLine();
        String typeOfLoan = scanner.nextLine();
        if (typeOfLoan.equals("1")) {
            System.out.println("Hur mycket vill du låna för bolån");
            double loanAmount = scanner.nextDouble();
            scanner.nextLine();
            functions.loan(loanAmount);
            Thread.sleep(1500);
        } else if (typeOfLoan.equals("2")) {
            System.out.println("Hur mycket vill du låna för privatlån");
            double loanAmount = scanner.nextDouble();
            scanner.nextLine();
            functions.loan(loanAmount);
            Thread.sleep(1500);
        }
    }

    public void suspendCard() throws InterruptedException {
        System.out.println("1 för att spärra 2 för att avbryta");
        System.out.println("Wait for input"); //debug-statement
        String choice = scanner.nextLine();
        if (choice.equals("1")) {
            bf.blockAccount();
        } else {
            System.out.println("Du avbröt");
        }
        Thread.sleep(1500);
    }

    public void activateOnlinePurchases() {
        functions.activateOnlinePurchases();
    }
}
