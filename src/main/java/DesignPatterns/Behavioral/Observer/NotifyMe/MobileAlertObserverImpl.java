package DesignPatterns.Behavioral.Observer.NotifyMe;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String phoneNo;
    StockObservableInterface stockObservableInterface;

    public MobileAlertObserverImpl(StockObservableInterface obj, String phoneNo) {
        stockObservableInterface = obj;
        this.phoneNo = phoneNo;
    }

    public void update() {
        sendMessage(phoneNo, "Stock count : " + stockObservableInterface.getStock());
    }

    public void sendMessage(String phoneNo, String message) {
        System.out.println("Message sent to phoneNo: " + phoneNo + " with content" + message);
    }
}
