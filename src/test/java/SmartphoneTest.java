import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
public class SmartphoneTest {


    Smartphone testSmartPhone = new Smartphone("20+ pro","Samsung",
            new ArrayList<>(List.of(new Friend("hamideh",2354365),new Friend("Soheila",234566))));




//    void testToString(){
//        Assertions.assertEquals(("Smartphone{" +
//                "modell='" + "20+ pro" + '\'' +
//                ", hersteller='" + "Samsung + '\'' +
//                ", allKontakt=" + "", testSmartPhone.toString());
//    }

    @Test
    void testGetPosition(){
        String result = testSmartPhone.getPosition();
        Assertions.assertEquals("Köln",result);
    }

    @Test
    void testStartRadio(){
        boolean result = testSmartPhone.startRadio();
        Assertions.assertEquals(true,result);
    }

    @Test
    void teststopRadio(){
        boolean result = testSmartPhone.stopRadio();
        Assertions.assertEquals(false,result);
    }

    @Test
    void testAddContact(){
        Contact daryush = new Friend("Daryush",6466745);
        boolean result = testSmartPhone.addContact(daryush);
        Assertions.assertEquals(true,result);
    }

    @Test
    void testGetContact(){
        Contact hamideh = new Friend("hamideh",2354365);
        testSmartPhone.addContact(hamideh);
        Contact result = testSmartPhone.getContact(0);
        Assertions.assertEquals(hamideh.toString(),result.toString());

    }

    @Test
    void testGetContactByName(){
        Contact hamideh = new Friend("hamideh",2354365);
        testSmartPhone.addContact(hamideh);
        Contact result = testSmartPhone.getContactByName("hamideh");
        Assertions.assertEquals(hamideh.toString(),result.toString());

    }

    @Test
    void testremoveContactByName(){
        boolean result = testSmartPhone.removeContactByName("hamideh");
        Assertions.assertEquals(true,result);

    }


}
