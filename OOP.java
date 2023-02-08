class Car {
    String name;
    String model;
    int price;

    public void check() {
        System.out.println("Your car specs are here ");
        System.out.println(this.name);
        System.out.println(this.model);
        System.out.println(this.price);
    }

    public void info(String name) {
        System.out.println(name);
    }

    // public void info(String model) {
    //     System.out.println(model);
    // }

    public void info(int price) {
        System.out.println(price);
    }
}

public class OOP {
    public static void main(String[] args) {
        Car car1 = new Car();
        // the new keyword create a heap space in memory
        // Car() constructer is function which create objects
        // contructor have properties
        // 1 the name must be same as class
        // by default in java create a contructor without manual creating in class
        // the contructors are parameterize and non parameterize
        /*
         * Car(String name)
         * this.name = name
         * 
         * this.name coming from class and name is from contructor argument
         */

        // car1 is an object which contain the blueprint of object
        car1.name = "Mehran";
        car1.model = "2023";
        car1.price = 2132;
        // for to print he given values we have to pass this keyword in class method.
        car1.check();
        car1.info(car1.price);

        /*
         * PolyMorphism: ability to perform same work with diffrent stratigies or forms
         * there
         * 2 types of polymorphism : function overloading(compiltime poly) : function
         * overriding(runtime poly)
         * function overloading(compiltime poly): create diffrent functions with the
         * same name
         * in fuctions there must be a diffrentiation factor either retun type or
         * argument(int srting )
         */
    }
}
