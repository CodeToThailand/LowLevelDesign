package DesignPatterns.Observer.WeatherService;

import java.util.ArrayList;
import java.util.List;

public class WSObservableImpl implements WSObservableInterface {
    int temp;
//    List<DisplayObserver> displayObserverList = new ArrayList<>();

    public void add(DisplayObserver obj) {
        displayObserverList.add(obj);
    }

    public void remove(DisplayObserver obj) {
        displayObserverList.remove(obj);
    }

    @Override
    public void notifyWeatherUpdate() {
        for(DisplayObserver d: displayObserverList) {
            d.update(this);
        }
    }

    public void setData(int t) {
        if(temp != t) {
            temp = t;
            System.out.println("Temp set to " + t);
            notifyWeatherUpdate();
        }
    }

    public int getData() {
        return temp;
    }
}
