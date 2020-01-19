package interfacePack;

public interface ITelephone {
    void powerOn();

    void dial(int number);

    void answer();

    boolean callPhone(int number);

    boolean isRinging();

}
