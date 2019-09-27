package my_store;

public class PhoneTest {

    public static void main(String[] args) {

        Android pixel3 = new Android(5.1);
        Iphone iPhone8 = new Iphone(6.1);
        Phone pixel4 = new Android(6.7);
        Phone iPhoneX = new Iphone(5.6);

        pixel3.makeCall("123");
        System.out.println(iPhoneX.getOS());

    }

}
