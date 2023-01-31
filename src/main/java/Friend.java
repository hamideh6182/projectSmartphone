public class Friend extends Contact{
    private int TelefonNummer;

    public Friend() {
    }

    public Friend(String name, int telefonNummer) {
        super(name);
        TelefonNummer = telefonNummer;
    }

    @Override
    public String toString() {
        return "Friend{" + super.toString() +
                "TelefonNummer=" + TelefonNummer +
                '}';
    }
}
