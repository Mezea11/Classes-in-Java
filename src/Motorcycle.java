public class Motorcycle {
    private String brand;
    private String model;
    private int year;

    // CONSTRUCTOR
    public Motorcycle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // GETTERS
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    //SETTERS
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Motorcycle [brand=" + brand + ", model=" + model + ", year=" + year + "]";
    }
}
