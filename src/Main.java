import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Banksystem banksystem = new Banksystem();
        Scanner scanner = new Scanner(System.in);
        Functions functions = new Functions();
        UserInterface ui = new UserInterface(scanner, functions);

        while(true){
            System.out.print("1. Logga in\n2. Registrera nytt konto\n3. Exit\n");
            String choice = scanner.next();

            if (choice.equals("1")){
                if (!banksystem.logIn()) {
                    continue;
                }
                ui.userChoice();
            } else if (choice.equals("2")) {
                banksystem.registerMember();
                ui.userChoice();
            }else if (choice.equals("3")){
                System.exit(0);
            } else {
                System.out.println("Ogiltig inmatning. Försök igen");
            }
        }

        /*while(true){
            System.out.print("Skriv 1 för att logga in eller 2 för att registerar dig: ");
            Scanner scan = new Scanner(System.in);
            String choice = scan.next();

            if (choice.equals("1")){
                banksystem.logIn();
            } else if (choice.equals("2")) {
                banksystem.registerMember();
            } else {
                System.out.println("Ogiltigt val. Försök igen");
            }
        }*/
    }
}
        /*Scanner s = new Scanner(System.in);
        System.out.println("Välkommen!");
        while (true) {
            System.out.println("1. Insättning\n2. Uttag\n3. Se saldo\n4. Kontakta oss\n5. Logga ut");
            int userChoice = s.nextInt();
            s.nextLine();

            switch (userChoice) {
                case 1:
                    f.showBalance();
                    System.out.println("Skriv in belopp att sätta in: ");
                    double DepositAmount = s.nextDouble();
                    try {
                        if (DepositAmount >= 0) {
                            f.deposit(DepositAmount);
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    Thread.sleep(1500);
                    break;
                case 2:
                    f.showBalance();
                    System.out.println("Skriv in belopp att ta ut (t.ex -belopp)");
                    double withdrawAmount = s.nextDouble();
                    f.withdraw(withdrawAmount);
                    Thread.sleep(1500);
                    break;
                case 3:
                    f.showBalance();
                    Thread.sleep(1500);
                    break;
                case 4:
                    c.getContacts();
                    Thread.sleep(1500);
                    break;
                case 5:
                    System.out.println("Du är nu utloggad.");
                    Thread.sleep(1000);
                    System.out.println("Välkommen åter!");
                    s.close();
                    System.exit(0);
                    break;
            }
        }*/

    /*Banksystem banksystem = new Banksystem();
    Functions f = new Functions();
    ContactsFromFile c = new ContactsFromFile();

    Scanner s = new Scanner(System.in);
        System.out.println("Välkommen!");
                while (true) {
                System.out.println("Välj ett av följande alternativen\n1. Logga In\n2. Registrera dig\n3. Insättning\n" +
                "4. kontoutdrag\n5. Betalning\n6. Visa saldo\n7. Kontakta oss\n8. Ta lån\n9. Logga ut");
                int userChoice = s.nextInt();
                s.nextLine();

                switch (userChoice) {
                case 1:
                banksystem.logIn();
                Thread.sleep(1500);
                break;
                case 2:
                banksystem.registerMember();
                Thread.sleep(1500);
                break;
                case 3:
                f.showBalance();
                System.out.println("Skriv in belopp att sätta in: ");
                double DepositAmount = s.nextDouble();
                try {
                if (DepositAmount >= 0) {
                f.deposit(DepositAmount);
                }
                } catch (NumberFormatException e) {
                e.printStackTrace();
                }
                Thread.sleep(1500);
                break;
                case 4:
                f.showBalance();
                System.out.println("Skriv in belopp att ta ut (t.ex -belopp)");
                double withdrawAmount = s.nextDouble();
                f.withdraw(withdrawAmount);
                Thread.sleep(1500);
                break;
                case 5:
                System.out.print("OCR/Kommentar: ");
                String ocrKommentar = s.nextLine();
                System.out.print("Summa: ");
                double paymentAmount = s.nextDouble();
                f.pay(paymentAmount);
                Thread.sleep(1500);
                break;
                case 6:
                f.showBalance();
                Thread.sleep(1500);
                break;
                case 7:
                c.getContacts();
                Thread.sleep(1500);
                break;
                case 8:
                System.out.println("Välj typ av lån\n" +
                "1. Bolån\n" +
                "2. privatlån");
                String typeOfLoan = s.nextLine();
                if(typeOfLoan.equals("1")){
                System.out.println("Hur mycket vill du låna för bolån");
                double loanAmount = s.nextDouble();
                f.loan(loanAmount);
                Thread.sleep(1500);
                break;
                }else if (typeOfLoan.equals("2")){
                System.out.println("Hur mycket vill du låna för privatlån");
                double loanAmount = s.nextDouble();
                f.loan(loanAmount);
                }
                Thread.sleep(1500);
                break;
                case 9:
                System.out.println("Du är nu utloggad.");
                Thread.sleep(1000);
                System.out.println("Välkommen åter!");
                s.close();
                System.exit(0);
                break;
                }
                }
                }
                }*/
