public class Car {
    public String brand;
    public String color;
    public int price;


    public Car(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public java.lang.String toString() {
        return (brand + " " + color + " " + price);
    }
}
