import java.util.List;

public class Smartphone implements Radio,GPS {

    private String modell;
    private String hersteller;
    List<Contact> allKontakt;

    public Smartphone() {
    }

    public Smartphone(String modell, String hersteller, List<Contact> allKontakt) {
        this.modell = modell;
        this.hersteller = hersteller;
        this.allKontakt = allKontakt;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public List<Contact> getAllKontakt() {
        return allKontakt;
    }

    public void setAllKontakt(List<Contact> allKontakt) {
        this.allKontakt = allKontakt;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modell='" + modell + '\'' +
                ", hersteller='" + hersteller + '\'' +
                ", allKontakt=" + allKontakt +
                '}';
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    public boolean addContact(Contact contact) {
        for (Contact c : allKontakt) {
            if (c.equals(contact)) {
                System.out.println("This contact is there!");
                return false;
            }

        }
        allKontakt.add(contact);
        return true;
    }
        public Contact getContact ( int index){
            if (allKontakt.size() > index && index >= 0)   {
                return allKontakt.get(index);
            }
            System.out.println("Contact does not found!");
            return null;
        }

        public Contact getContactByName (String name){
            for (Contact c : allKontakt) {
                if (c.getName().equals(name)) {
                    return c;
                }
            }
            System.out.println("Contact does not found!");
            return null;
        }

        public boolean removeContactByName (String name){
            for (Contact c : allKontakt) {
                if (c.getName().equals(name)) {
                    allKontakt.remove(c);
                    return true;
                }
            }
            System.out.println("Contact does not found!");
            return false;

        }


}
