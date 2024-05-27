package DesignPatterns.Observer.WeatherService;

public class TvDisplayObserver implements DisplayObserver{

    @Override
    public void update(WSObservableInterface wsObservableInterface) {
        System.out.println("wsObservableInterface temp in TV: " + wsObservableInterface.getData());
    };
}
