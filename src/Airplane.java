public class Airplane {
    private String model;
    private int passengerCapacity;
    private int yearCreated;
    private boolean lightOn;
    private int cruiseSpeed;


    public Airplane(String model, int passengerCapacity, int yearCreated) {
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.yearCreated = yearCreated;
    }

    public boolean toggleLight(){
        lightOn = !lightOn;
        return lightOn;
    }

    public void cruise(int cruiseSpeed){
        this.cruiseSpeed = cruiseSpeed;
    }


}
