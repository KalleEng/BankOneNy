import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContactsFromFile {
    private final String contactFile = "src/contacts.txt.txt";
    String setTextYellow = "\u001B[33m";
    String turnOffTextYellow = "\u001B[0m";


    public void getContacts() {
        StringBuilder builder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(contactFile))){
            String txt;
            while ((txt = reader.readLine()) != null) {
                builder.append(txt).append("\n");
            }
            System.out.println(setTextYellow + builder + turnOffTextYellow);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
