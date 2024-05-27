package DesignPatterns.Observer.NotifyMe;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String mailId;
    StockObservableInterface stockObservableInterface;

    public EmailAlertObserverImpl(StockObservableInterface obj, String mail) {
        mailId = mail;
        stockObservableInterface = obj;
    }

    public void update() {
        sendMail(mailId, "Stock count :" + stockObservableInterface.getStock());
    }

    public void sendMail(String mailId, String message) {
        System.out.println("Sent mail to " + mailId + " with the message: " + message);

    }


}
