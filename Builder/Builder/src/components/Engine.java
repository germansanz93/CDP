package components;

public class Engine {
    private final Double volume;
    private Double mileage;
    private Boolean started;

    public Engine(Double volume, Double mileage){
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on(){
        started = true;
    }

    public void off(){
        started = false;
    }

    public boolean isStarted(){
        return started;
    }

    public void go(Double mileage){
        if(started) {
            this.mileage += mileage;
        } else {
            System.out.println("Cannot go, you must start the engine first");
        }
    }

    public Double getVolume(){
        return volume;
    }

    public Double getMileage(){
        return mileage;
    }
}
