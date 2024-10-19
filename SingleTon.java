class SingleTon {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 4, 6);
        System.out.println(car1.name);
        System.out.println(car1.wheelCount);
        System.out.println(car1.seatCount);
        System.out.println("******************************");
        Car car2 = new Car("TATA", 4, 5);
        System.out.println(car2.name);
        System.out.println(car2.wheelCount);
        System.out.println(car2.seatCount);
    }
}

class Car {
    int wheelCount;
    int seatCount;
    String name;

    Car(String nam, int wheelCount, int seatCount) {
        name = nam;
        this.wheelCount = wheelCount;
        this.seatCount = seatCount;
    }
}