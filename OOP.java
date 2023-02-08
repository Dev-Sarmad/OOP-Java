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
}

public class OOP {
    public static void main(String[] args) {
        Car car1 = new Car();
        // the new keyword create a heap space  in memory
        // Car() constructer is function which create objects
        // contructor have  properties 
        // 1 the name must be same as class
        // by default in java create a contructor without manual creating in class
        // the contructors are parameterize and non parameterize
        /*Car(String name)
         this.name = name

         this.name coming from  class and name is from contructor argument 
        */
        
        // car1 is an object which contain the blueprint of object
        car1.name = "Mehran";
        car1.model = "2023";
        car1.price = 2132;
        // for to print he given values we have to pass this keyword in class method.
        car1.check();
    }
}
