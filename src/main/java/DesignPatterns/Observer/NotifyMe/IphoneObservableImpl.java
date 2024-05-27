package DesignPatterns.Observer.NotifyMe;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservableInterface{

    int stockCount;

    public List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();

    public void add(NotificationAlertObserver obj) {
        notificationAlertObserverList.add(obj);
    }

    public void remove(NotificationAlertObserver obj) {
        notificationAlertObserverList.remove(obj);
    }

    public void notifyUsers() {
        for(NotificationAlertObserver obj: notificationAlertObserverList) {
            obj.update();
        }
    }

    public void setStock(int addedStock) {
        if(stockCount == 0 && addedStock > 0) {
            notifyUsers();
        }
        stockCount += addedStock;
    }

    public int getStock() {
        return stockCount;
    }
}
