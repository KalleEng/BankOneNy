import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banksystem banksystem = new Banksystem();

        while(true){
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
    }
}
