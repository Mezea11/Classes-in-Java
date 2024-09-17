public class Truck {
    private String truckName;
    private int truckCapacity;

    // CONSTRUCTOR
    public Truck(String truckName, int truckCapacity) {
        this.truckName = truckName;
        this.truckCapacity = truckCapacity;
    }

    // GETTERS
    public String getTruckName() {
        return truckName;
    }
    public int getTruckCapacity() {
        return truckCapacity;
    }

    // SETTERS
    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    public void setTruckCapacity(int truckCapacity) {
        this.truckCapacity = truckCapacity;
    }


    @Override
    public String toString() {
        return ("Truck Name: " + truckName + ", Capacity: " + truckCapacity);
    }
}
