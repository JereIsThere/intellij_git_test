package interfacePack;

public class Main {
    public static void main(String[] args) {
        ITelephone jPhone = new Deskphone(123456);
        jPhone.powerOn();
        jPhone.dial(123456);
        jPhone.answer();

        jPhone = new MobilePhone(123456);
        jPhone.powerOn();
        jPhone.dial(123456);
        jPhone.answer();

    }
}
