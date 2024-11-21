// class Human {
//     private String _name;
//     private int _age;

//     void setName(String name) {
//         _name = name;
//     }

//     String getName() {
//         return _name;
//     }

//     void setAge(int age) {
//         _age = age;
//     }

//     int getAge() {
//         return _age;
//     }
// }

class Animal {
    void move(int a) {
        System.out.println("This is parent move");
    }

    void move(boolean a) {
        System.out.println("This is parent move");
    }
}

class Dog extends Animal {
    // @Override
    // void move( a) {
    // System.out.println("This is child move");
    // }
}

public interface Tea {

    void milk();
}
