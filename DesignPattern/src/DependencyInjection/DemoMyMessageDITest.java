package DependencyInjection;

public class DemoMyMessageDITest {
    public static void main(String[] args) {
        String msg = "Hi Khanh";
        String email = "khanhhq@itsj-group.com.vn";
        String phone = "0123456789";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);
        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}
