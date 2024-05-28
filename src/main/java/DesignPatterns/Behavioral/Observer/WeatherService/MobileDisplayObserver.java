package DesignPatterns.Behavioral.Observer.WeatherService;

public class MobileDisplayObserver implements DisplayObserver{

    @Override
    public void update(WSObservableInterface wsObservableInterface) {
        if(wsObservableInterface instanceof WSObservableImpl)
            System.out.println("wsObservableInterface temp in Mobile: " + wsObservableInterface.getData());
    }
}
