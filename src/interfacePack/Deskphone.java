package interfacePack;

public class Deskphone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public Deskphone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("doesn't have a power button");
    }

    @Override
    public void dial(int number) {
        System.out.println("now ringing " + number + " on deskphone");
    }

    @Override
    public void answer() {
        if (this.isRinging) {
            System.out.println("answering deskphone");
            this.isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int number) {
        this.isRinging = number == this.myNumber;
        return this.isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
