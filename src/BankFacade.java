import java.util.Scanner;

public class BankFacade {

    private ContactsFromFile contactsFromFile;
    private Banksystem banksystem;
    private Functions functions;
    private UserInterface ui;

    public Functions getFunctions() {
        return functions;
    }

    public BankFacade(){
        contactsFromFile = new ContactsFromFile();
        banksystem = new Banksystem();
        functions = new Functions();
        ui = new UserInterface(new Scanner(System.in), functions, this);

    }

    public void Register(){
        banksystem.registerMember();
    }

    public boolean Login() {
      return banksystem.logIn();

    }

        public void Save(String personNumber, String customerName){
        banksystem.saveMember(personNumber, customerName);
    }

    public boolean authenticate(String personNumber, String customerName){
        return banksystem.authenticateMember(personNumber, customerName);
    }

    public void Contacts(){
        contactsFromFile.getContacts();
    }

    public void Deposit(double amount){
        functions.deposit(amount);
    }

    public void Withdraw(double amount){
        functions.withdraw(amount);
    }

    public void ShowBalance(){
        functions.showBalance();
    }

    public void blockAccount(){
        functions.blockAccount();
    }

    public void Pay(double amount){
        functions.pay(amount);
    }

    public void Loan(double amount){
        functions.loan(amount);
    }

    public void activateOnlinePurchases(){
        ui.activateOnlinePurchases();
    }
    public boolean userChoice() throws InterruptedException {
        return ui.userChoice();
    }

}
