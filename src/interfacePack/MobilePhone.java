package interfacePack;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
        this.isOn = false;
    }

    @Override
    public void powerOn() {

        if (!this.isOn) {
            System.out.println("mobile phone powering on");
            this.isOn = true;
        } else {
            System.out.println("powering mobile phone off");
            this.isOn = false;
        }
    }

    @Override
    public void dial(int number) {
        if (isOn) {
            System.out.println("now ringing " + number + " on mobile phone");
        } else {
            System.out.println("mobile phone is turned off");
        }
    }

    @Override
    public void answer() {
        if (this.isRinging) {
            System.out.println("answering mobile phone");
            this.isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int number) {
        if (number == this.myNumber && isOn) {
            this.isRinging = true;
            System.out.println("melody ring");
        } else {
            this.isRinging = false;
        }
        return this.isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
