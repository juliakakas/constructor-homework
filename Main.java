public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022);
        System.out.println(myCar.getBrand()); // Output: Toyota

        Car defaultCar = new Car();
        System.out.println(defaultCar.getModel()); // Output: Unknown
    }
}
