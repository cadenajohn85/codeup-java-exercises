package my_store;

public class Phone {

    private String number;
    private double screenSize;
    private String OS;

    public Phone(double sS, String OS)  {
        this.screenSize = sS;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String newNumber) {
        this.number = newNumber;
    }

    public double getScreenSize() {
        return this.screenSize;
    }

    public void setScreenSize(double newScreenSize) {
        this.screenSize = newScreenSize;
    }

    public String getOS() {
        return this.OS;
    }

    public void setOS(String newOS) {
        this.OS = newOS;
    }

    public void makeCall(String aNumber) {
        System.out.println("Dialing... " + aNumber);
    }

}

