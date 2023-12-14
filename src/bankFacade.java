public class bankFacade {

    private ContactsFromFile contactsFromFile;
    private Banksystem banksystem;
    private Functions functions;

    public bankFacade(){
        contactsFromFile = new ContactsFromFile();
        banksystem = new Banksystem();
        functions = new Functions();
    }

    public void Register(){
        banksystem.registerMember();
    }

    public void Login(){
        banksystem.logIn();
    }

    public void Save(String personNumber, String customerName){
        banksystem.saveMember(personNumber, customerName);
    }

    public void Authenticate(String personNumber, String customerName){
        banksystem.authenticateMember(personNumber, customerName);
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

    public void Spärra(){
        functions.SpärraKonto();
    }

    public void Pay(double amount){
        functions.pay(amount);
    }

    public void Loan(double amount){
        functions.loan(amount);
    }

    public void AktiveraOnlineKöp(){
        functions.AktiveraOnlineKöp();
    }

}
