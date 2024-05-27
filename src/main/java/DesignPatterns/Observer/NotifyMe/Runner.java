package DesignPatterns.Observer.NotifyMe;

public class Runner {
    public static void main(String[] args) {
        IphoneObservableImpl iphoneObservable = new IphoneObservableImpl();
        MobileAlertObserverImpl mobileAlertObserver = new MobileAlertObserverImpl(iphoneObservable, "7044");
        EmailAlertObserverImpl emailAlertObserver = new EmailAlertObserverImpl(iphoneObservable, "abc@mail.com");

        iphoneObservable.add(mobileAlertObserver);
        iphoneObservable.add(emailAlertObserver);

        iphoneObservable.setStock(5);
    }
}
