public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", "red", 2000);
        Car car2 = new Car("BMW", "blue", 20000);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.price + car2.price);

        Teacher teacher1 = new Teacher("Christian", 28, "Programming");
        Teacher teacher2 = new Teacher("Christina", 33, "Maths");
        Student student1 = new Student("Christos", "Maths");
        Student student2 = new Student("Christopher", "Programming");

        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(student1);
        System.out.println(student2);

        Truck truck1 = new Truck("T299", 2000);
        Truck truck2 = new Truck("C400", 3000);
        Motorcycle motorcycle1 = new Motorcycle("Yamaha", "c100", 2004);
        Motorcycle motorcycle2 = new Motorcycle("Yamaha", "d4003", 2011);

        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(motorcycle1);
        System.out.println(motorcycle2);

        truck1.setTruckName("Christians Truck");
        truck2.setTruckName("Christinas Truck");
        motorcycle1.setYear(1999);
        motorcycle2.setYear(2000);
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(motorcycle1);
        System.out.println(motorcycle2);


    }
}