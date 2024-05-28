package DesignPatterns.Behavioral.Observer.NotifyMe;

import java.util.ArrayList;
import java.util.List;

interface StockObservableInterface {

    List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();

    public void add(NotificationAlertObserver obj);

    public void remove(NotificationAlertObserver obj);

    public void setStock(int addedStock);

    public int getStock();

    public void notifyUsers();

}
