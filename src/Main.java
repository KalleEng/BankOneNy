import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

    bankFacade bf = new bankFacade();

    Scanner s = new Scanner(System.in);
        System.out.println("Välkommen!");
                while (true) {
                System.out.println("Välj ett av följande alternativen\n1. Logga In\n2. Registrera dig\n3. Insättning\n" +
                "4. kontoutdrag\n5. Betalning\n6. Visa saldo\n7. Kontakta oss\n8. Ta lån\n9. Logga ut");
                int userChoice = s.nextInt();
                s.nextLine();

                switch (userChoice) {
                case 1:
                bf.Login();
                Thread.sleep(1500);
                break;
                case 2:
                bf.Register();
                Thread.sleep(1500);
                break;
                case 3:
                bf.ShowBalance();
                System.out.println("Skriv in belopp att sätta in: ");
                double DepositAmount = s.nextDouble();
                try {
                if (DepositAmount >= 0) {
                bf.Deposit(DepositAmount);
                }
                } catch (NumberFormatException e) {
                e.printStackTrace();
                }
                Thread.sleep(1500);
                break;
                case 4:
                bf.ShowBalance();
                System.out.println("Skriv in belopp att ta ut (t.ex -belopp)");
                double withdrawAmount = s.nextDouble();
                bf.Withdraw(withdrawAmount);
                Thread.sleep(1500);
                break;
                case 5:
                System.out.print("OCR/Kommentar: ");
                String ocrKommentar = s.nextLine();
                System.out.print("Summa: ");
                double paymentAmount = s.nextDouble();
                bf.Pay(paymentAmount);
                Thread.sleep(1500);
                break;
                case 6:
                bf.ShowBalance();
                Thread.sleep(1500);
                break;
                case 7:
                bf.Contacts();
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
                bf.Loan(loanAmount);
                Thread.sleep(1500);
                break;
                }else if (typeOfLoan.equals("2")){
                System.out.println("Hur mycket vill du låna för privatlån");
                double loanAmount = s.nextDouble();
                bf.Loan(loanAmount);
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
}