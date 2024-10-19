public class SingleTonDemo {
    public static void main(String[] args) {
        Car car1 = Car.createObj("BMW", 4, 6);
        System.out.println(car1.name);
        System.out.println(car1.wheelCount);
        System.out.println(car1.seatCount);
        System.out.println("******************************");
        Car car2 = Car.createObj("TATA", 4, 5);
        System.out.println(car2.name);
        // System.out.println(car2.wheelCount  );
        System.out.println(car2.seatCount);
    }
}

class Car {
    static Car obj;
    int wheelCount;
    int seatCount;
    String name;

    // new Car()
    private Car(String nam, int wheelCount, int seatCount) {
        name = nam;
        this.wheelCount = wheelCount;
        this.seatCount = seatCount;
    }

    static Car createObj(String name, int wheelCount, int seatCount) {
        if (obj == null) {
            obj = new Car(name, wheelCount, seatCount);
        }
        return obj;
    }

}