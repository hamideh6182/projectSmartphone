import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Friend hamideh = new Friend("Hamideh",12344556);
        Friend daryush = new Friend("Daryush", 25546437);

        List<Contact> contactList = new ArrayList<>();
        contactList.add(hamideh);
        contactList.add(daryush);

        Smartphone samsung = new Smartphone("20+","Samsung",contactList);

        System.out.println(samsung.toString());


    }
}
