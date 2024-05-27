package DesignPatterns.Observer.WeatherService;

public class Runner {
    public static void main(String[] args) {
        WSObservableImpl wsObservableObject = new WSObservableImpl();

        TvDisplayObserver tvDisplayObserverObject = new TvDisplayObserver();

        MobileDisplayObserver mobileDisplayObserverObject = new MobileDisplayObserver();

        wsObservableObject.add(tvDisplayObserverObject);
        wsObservableObject.add(mobileDisplayObserverObject);
        wsObservableObject.setData(50);
    }
}
