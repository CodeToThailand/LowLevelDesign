package DesignPatterns.Observer.WeatherService;

import java.util.ArrayList;
import java.util.List;

public interface WSObservableInterface {

//    final public static variables
//   int temp = 0;//temp would be final if declared here
    List<DisplayObserver> displayObserverList = new ArrayList<>();

    //abstract public methods
    void add(DisplayObserver obj);

    void remove(DisplayObserver obj);

    void notifyWeatherUpdate();

    void setData(int t);

    int getData();

}
